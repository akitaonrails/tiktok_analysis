package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.BroadcastUserApi;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateCoverEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFixCoverSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import u4.q0;

/* JADX INFO: renamed from: X.0TiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754410TiZ {
    public static int LJIIJ = 1;
    public static int LJIIJJI = 1;
    public final BaseFragment LIZ;
    public C202139147l LIZIZ;
    public String LIZJ;
    public final C11NJ LIZLLL;
    public final DataChannel LJ;
    public boolean LJFF;
    public ImageModel LJI;
    public final User LJII;
    public final Map<String, ImageModel> LJIIIIZZ;
    public C754440Tic LJIIIZ;

    public final String LIZ() {
        ImageModel imageModel;
        if (!this.LJFF && (imageModel = this.LJI) != null) {
            if (imageModel.getUri() != null) {
                return this.LJI.getUri();
            }
            if (!C086I.LIZIZ(this.LJI.getUrls())) {
                return UriProtector.parse((String) ListProtector.get(this.LJI.getUrls(), 0)).toString();
            }
        }
        return "";
    }

    public final String LIZIZ() {
        LiveMode liveMode = (LiveMode) this.LJ.gg0(LiveModeChannel.class);
        if (liveMode != null && !liveMode.equals(LiveMode.VIDEO)) {
            if (liveMode.equals(LiveMode.THIRD_PARTY)) {
                return "third_party";
            }
            if (liveMode.equals(LiveMode.SCREEN_RECORD)) {
                return "screen_share";
            }
        }
        return "video_live";
    }

    public final void LIZLLL(Throwable th) {
        String strLJIJI;
        if (th instanceof C501470JlZ) {
            strLJIJI = ((C501470JlZ) th).getErrorMsg();
        } else {
            strLJIJI = null;
        }
        if (TextUtils.isEmpty(strLJIJI)) {
            strLJIJI = C497740JfY.LJIJI(2131855118);
        }
        this.LIZJ = null;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        this.LIZIZ.LIZ();
        C766270U4b.LJIIIZ(C497740JfY.LJII(), strLJIJI);
    }

    public final void LJ(ImageModel imageModel) {
        String str;
        String strValueOf;
        String str2;
        String str3;
        this.LJ.zW(BroadcastCoverData.class, imageModel);
        Map<String, ImageModel> map = this.LJIIIIZZ;
        LiveMode liveMode = (LiveMode) this.LJ.gg0(LiveModeChannel.class);
        if (liveMode == null) {
            liveMode = LiveMode.VIDEO;
        }
        ((HashMap) map).put(liveMode.logStreamingType, imageModel);
        this.LJ.FQ2(UpdateCoverEvent.class);
        this.LJ.SX0(C753130TgV.class, "new_cover");
        this.LJFF = false;
        this.LIZIZ.LIZ();
        this.LJI = imageModel;
        if (LIZIZ().equals("video_live") && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment()) {
            str = "live_detail";
        } else {
            str = "outside";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cover_modify_over");
        c474500IjALIZ.LJIJJLI(this.LJ);
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILJJIL("cover_edit");
        c474500IjALIZ.LJJII(LIZIZ(), "live_type");
        c474500IjALIZ.LJJII(this.LIZJ, "shooting_date");
        c474500IjALIZ.LJJII(String.valueOf(System.currentTimeMillis()), "current_date");
        c474500IjALIZ.LJJII(this.LJI.getUri(), "cover_url");
        User user = this.LJII;
        if (user == null) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(user.getId());
        }
        c474500IjALIZ.LJJII(String.valueOf(strValueOf), "anchor_id");
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LIZ();
        this.LIZJ = null;
        User user2 = (User) UserService.getInstance().user().getCurrentUser();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("pm_live_photo_upload");
        c474500IjALIZ2.LJIJJLI(this.LJ);
        c474500IjALIZ2.LJIILL("click");
        c474500IjALIZ2.LJIIJJI("live");
        c474500IjALIZ2.LJJII(LIZIZ(), "live_type");
        c474500IjALIZ2.LJJII(String.valueOf(user2.getId()), "anchor_id");
        if (this.LIZIZ.LIZ) {
            str2 = "take_photo";
        } else {
            str2 = "select_library";
        }
        c474500IjALIZ2.LJJII(str2, "upload_type");
        c474500IjALIZ2.LIZ();
        if (this.LJIIIZ != null) {
            ImageModel imageModel2 = this.LJI;
            if (imageModel2 != null && !C086I.LIZIZ(imageModel2.getUrls())) {
                str3 = (String) ListProtector.get(this.LJI.getUrls(), 0);
            } else {
                str3 = "";
            }
            String strLIZ = LIZ();
            C771680UOw.LJII = str3;
            C771680UOw.LJIIIIZZ = strLIZ;
        }
    }

    public C754410TiZ(BaseFragment baseFragment, DataChannel dataChannel) {
        InterfaceC2262081DgM currentUser;
        User user;
        int i = LJIIJ;
        int i2 = LJIIJJI;
        this.LIZLLL = new C11NJ();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUser = interfaceC500940JkiUser.getCurrentUser();
        } else {
            currentUser = null;
        }
        if (currentUser instanceof User) {
            user = (User) currentUser;
        } else {
            user = null;
        }
        this.LJII = user;
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = null;
        this.LJ = dataChannel;
        LJIIJ = i;
        LJIIJJI = i2;
        int value = LiveCoverMinSizeSetting.INSTANCE.getValue();
        this.LIZ = baseFragment;
        this.LIZIZ = C202139147l.LJ(baseFragment.getActivity(), baseFragment, "cover", LJIIJ, LJIIJJI, value, value, new InterfaceC202141147n() { // from class: X.0U8S
            @Override // X.InterfaceC202141147n
            public final /* synthetic */ void onCanceled() {
            }

            @Override // X.InterfaceC202141147n
            public final void LIZ(String str, String str2) {
                C754410TiZ c754410TiZ = this.LIZ;
                c754410TiZ.LIZJ = str2;
                c754410TiZ.LIZIZ.LJIIIZ();
                C0VSJ c0vsj = new C0VSJ(str);
                if (!c0vsj.exists()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("avatar file don't exists in path ");
                    sbLIZ.append(str);
                    c754410TiZ.LIZLLL(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                    return;
                }
                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", c0vsj));
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                C0UVW c0uvwLIZ = C01QD.LIZ();
                c0uvwLIZ.getClass();
                ((BroadcastUserApi) c0uvwLIZ.LIZJ(BroadcastUserApi.class)).uploadAvatar(multipartTypedOutput).LJFF(new C0UO0()).LIZ(new C786210Usl(c754410TiZ, str, 0));
                c754410TiZ.LIZJ = str2;
            }
        }, true, true, false);
    }

    public final void LIZJ(int i, ImageModel imageModel, boolean z, C1324720kZq c1324720kZq, TextView textView, int i2) {
        if (c1324720kZq != null) {
            final String strLJIJI = C497740JfY.LJIJI(2131840793);
            q0.LJIJ(c1324720kZq, new C20094213jo() { // from class: X.0ToR
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.addAction(new C20092413jW(16, strLJIJI));
                }
            });
        }
        if (imageModel != null) {
            this.LJI = imageModel;
        }
        if (i != 0 && i != 1) {
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if (currentUser instanceof User) {
                if (i2 == 100) {
                    imageModel = currentUser.getAvatarLarge();
                } else if (i2 == 101) {
                    imageModel = currentUser.getAvatarMedium();
                } else {
                    imageModel = currentUser.getAvatarThumb();
                }
                if (textView != null) {
                    C786410Ut5.S4(1.0f, textView);
                }
                this.LJI = currentUser.getAvatarThumb();
                this.LJFF = true;
            } else {
                imageModel = null;
            }
        } else {
            if (textView != null) {
                C786410Ut5.S4(1.0f, textView);
            }
            this.LJFF = z;
        }
        Map<String, ImageModel> map = this.LJIIIIZZ;
        LiveMode liveMode = (LiveMode) this.LJ.gg0(LiveModeChannel.class);
        if (liveMode == null) {
            liveMode = LiveMode.VIDEO;
        }
        if (((HashMap) map).get(liveMode.logStreamingType) != null) {
            Map<String, ImageModel> map2 = this.LJIIIIZZ;
            LiveMode liveMode2 = (LiveMode) this.LJ.gg0(LiveModeChannel.class);
            if (liveMode2 == null) {
                liveMode2 = LiveMode.VIDEO;
            }
            imageModel = (ImageModel) ((HashMap) map2).get(liveMode2.logStreamingType);
            if (AnchorFixCoverSetting.INSTANCE.enable()) {
                this.LJI = imageModel;
            }
        }
        if (imageModel != null) {
            C486790J7d.LIZJ(new RunnableC514501zT(imageModel, c1324720kZq, 42));
            this.LJ.zW(BroadcastCoverData.class, imageModel);
        }
        this.LJ.SX0(C753130TgV.class, "last_cover");
        C784440Upu.LIZ().LIZIZ(new C753140TgW());
    }
}
