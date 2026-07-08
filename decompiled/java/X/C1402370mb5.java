package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.RightSlotAssem;
import com.ss.android.ugc.aweme.innerpush.settings.InnerPushImageOptimizeExp;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402370mb5 extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402370mb5(C1365110lcz c1365110lcz, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1365110lcz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402370mb5(LeftAvatarAssem leftAvatarAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = leftAvatarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402370mb5(LeftSlotAssem leftSlotAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = leftSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402370mb5(RightSlotAssem rightSlotAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = rightSlotAssem;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C1402370mb5 c1402370mb5, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        List<User> list;
        User user;
        String uid;
        List<User> list2;
        InnerPushUITemplate uiTemplate;
        List<User> list3;
        User user2;
        List<User> list4;
        User user3;
        List<String> list5 = (List) obj2;
        List<String> list6 = (List) obj3;
        Function2 function2 = (Function2) obj4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] avatarUrls = ");
        sbLIZ.append(list5);
        sbLIZ.append(", secondAvatarUrls = ");
        sbLIZ.append(list6);
        sbLIZ.append(", multiAvatarsLoadFunction = ");
        sbLIZ.append(function2);
        C19290510dT.LIZLLL("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (list6 != null && !list6.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String uid2 = null;
        if (!z) {
            if (((Boolean) InnerPushImageOptimizeExp.LIZJ.getValue()).booleanValue()) {
                IMAvatarLoaderApi.LIZ.getClass();
                IMAvatarLoaderApi iMAvatarLoaderApi = C04TK.LIZIZ;
                C0ZKG c0zkgLIZJ = iMAvatarLoaderApi.LIZJ((SmartImageView) ((LeftAvatarAssem) c1402370mb5.l0).LLJLL.getValue(), "inner_push");
                InnerPushUITemplate uiTemplate2 = ((LeftAvatarAssem) c1402370mb5.l0).ip().getUiTemplate();
                if (uiTemplate2 != null && (list4 = uiTemplate2.fromUsers) != null && (user3 = (User) C13LP.LJJJLL(list4)) != null) {
                    uid = user3.getUid();
                } else {
                    uid = null;
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(list5);
                c0zkgLIZJ.LIZIZ(uid, urlModel, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C0ZKG c0zkgLIZJ2 = iMAvatarLoaderApi.LIZJ((SmartImageView) ((LeftAvatarAssem) c1402370mb5.l0).LLJLILLLLZIIL.getValue(), "inner_push");
                InnerPushUITemplate uiTemplate3 = ((LeftAvatarAssem) c1402370mb5.l0).ip().getUiTemplate();
                if (uiTemplate3 != null && (list2 = uiTemplate3.fromUsers) != null && list2.size() == 2 && (uiTemplate = ((LeftAvatarAssem) c1402370mb5.l0).ip().getUiTemplate()) != null && (list3 = uiTemplate.fromUsers) != null && (user2 = (User) ListProtector.get(list3, 1)) != null) {
                    uid2 = user2.getUid();
                }
                UrlModel urlModel2 = new UrlModel();
                urlModel2.setUrlList(list6);
                final LeftAvatarAssem leftAvatarAssem = (LeftAvatarAssem) c1402370mb5.l0;
                c0zkgLIZJ2.LIZIZ(uid2, urlModel2, new C0ZKF(0, 0, 0, 0, 0, new C0ZK1() { // from class: X.15uO
                    @Override // X.C0ZK1
                    public final void LIZ() {
                    }

                    @Override // X.C0ZK1
                    public final void LIZIZ() {
                        leftAvatarAssem.ip().getTracker().LJIILIIL = 0;
                    }

                    @Override // X.C0ZK1
                    public final void LIZJ(int i, String str, boolean z2) {
                        leftAvatarAssem.ip().getTracker().LJIILIIL = 1;
                        leftAvatarAssem.ip().getTracker().LJII = System.currentTimeMillis() - jCurrentTimeMillis;
                        leftAvatarAssem.ip().getTracker().LJIIJ = 2;
                    }
                }, 95));
            } else {
                UrlModel urlModel3 = new UrlModel();
                urlModel3.setUrlList(list5);
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel3));
                c1331670kl3LJIIIIZZ.LJJ((SmartImageView) ((LeftAvatarAssem) c1402370mb5.l0).LLJLL.getValue());
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                UrlModel urlModel4 = new UrlModel();
                urlModel4.setUrlList(list6);
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel4));
                c1331670kl3LJIIIIZZ2.LJJ((SmartImageView) ((LeftAvatarAssem) c1402370mb5.l0).LLJLILLLLZIIL.getValue());
                final LeftAvatarAssem leftAvatarAssem2 = (LeftAvatarAssem) c1402370mb5.l0;
                c1331670kl3LJIIIIZZ2.LJJJIL = new InterfaceC658750Psf() { // from class: X.15uP
                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void Ck(JSONObject jSONObject) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onImageSensibleLoaded imageMonitorData:");
                        sbLIZ2.append(jSONObject);
                        C19290510dT.LIZ("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ2));
                        int i = 1;
                        if (!jSONObject.optBoolean("isSuccess")) {
                            i = 0;
                        }
                        leftAvatarAssem2.ip().getTracker().LJIILIIL = i;
                        leftAvatarAssem2.ip().getTracker().LJII = jSONObject.optLong("duration", -1L);
                        leftAvatarAssem2.ip().getTracker().LJIIJ = jSONObject.optInt("from", -1);
                    }
                };
                C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
            }
            ((LeftAvatarAssem) c1402370mb5.l0).sp(2);
        } else if (list5 != null && list5.size() == 1) {
            ((LeftAvatarAssem) c1402370mb5.l0).sp(1);
            if (((Boolean) InnerPushImageOptimizeExp.LIZJ.getValue()).booleanValue()) {
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                IMAvatarLoaderApi.LIZ.getClass();
                C0ZKG c0zkgLIZJ3 = C04TK.LIZIZ.LIZJ(((LeftAvatarAssem) c1402370mb5.l0).lp(), "inner_push");
                InnerPushUITemplate uiTemplate4 = ((LeftAvatarAssem) c1402370mb5.l0).ip().getUiTemplate();
                if (uiTemplate4 != null && (list = uiTemplate4.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null) {
                    uid2 = user.getUid();
                }
                UrlModel urlModel5 = new UrlModel();
                urlModel5.setUrlList(list5);
                final LeftAvatarAssem leftAvatarAssem3 = (LeftAvatarAssem) c1402370mb5.l0;
                c0zkgLIZJ3.LIZIZ(uid2, urlModel5, new C0ZKF(0, 0, 0, 0, 0, new C0ZK1() { // from class: X.15uR
                    @Override // X.C0ZK1
                    public final void LIZ() {
                    }

                    @Override // X.C0ZK1
                    public final void LIZIZ() {
                        leftAvatarAssem3.ip().getTracker().LJIILIIL = 0;
                    }

                    @Override // X.C0ZK1
                    public final void LIZJ(int i, String str, boolean z2) {
                        leftAvatarAssem3.ip().getTracker().LJIILIIL = 1;
                        leftAvatarAssem3.ip().getTracker().LJII = System.currentTimeMillis() - jCurrentTimeMillis2;
                        leftAvatarAssem3.ip().getTracker().LJIIJ = 2;
                    }
                }, 95));
            } else {
                String str = (String) C13LP.LJJJLL(list5);
                if (str != null) {
                    final LeftAvatarAssem leftAvatarAssem4 = (LeftAvatarAssem) c1402370mb5.l0;
                    C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                    c1331670kl3LJIIIIZZ3.LJJ(leftAvatarAssem4.lp());
                    c1331670kl3LJIIIIZZ3.LIZLLL("singleHeadAvatar");
                    c1331670kl3LJIIIIZZ3.LJJJIL = new InterfaceC658750Psf() { // from class: X.15uQ
                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z2, String str2, JSONObject jSONObject) {
                        }

                        @Override // X.InterfaceC658750Psf
                        public final void Ck(JSONObject jSONObject) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onImageSensibleLoaded imageMonitorData:");
                            sbLIZ2.append(jSONObject);
                            C19290510dT.LIZ("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ2));
                            int i = 1;
                            if (!jSONObject.optBoolean("isSuccess")) {
                                i = 0;
                            }
                            leftAvatarAssem4.ip().getTracker().LJIILIIL = i;
                            leftAvatarAssem4.ip().getTracker().LJII = jSONObject.optLong("duration", -1L);
                            leftAvatarAssem4.ip().getTracker().LJIIJ = jSONObject.optInt("from", -1);
                        }
                    };
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ3);
                }
            }
        }
        if (function2 != null) {
            LeftAvatarAssem leftAvatarAssem5 = (LeftAvatarAssem) c1402370mb5.l0;
            function2.invoke(leftAvatarAssem5.LLJLILLLLZIIL.getValue(), leftAvatarAssem5.LLJLL.getValue());
            leftAvatarAssem5.sp(2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C1402370mb5 c1402370mb5, Object obj, Object obj2, Object obj3, Object obj4) {
        FrameLayout.LayoutParams layoutParams;
        View view = (View) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe], topIconView = ");
        sbLIZ.append(view);
        sbLIZ.append(", iconWidth = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", iconHeight = ");
        sbLIZ.append(iIntValue2);
        C19290510dT.LIZLLL("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (view == null) {
            int childCount = ((LeftAvatarAssem) c1402370mb5.l0).kp().getChildCount();
            if (childCount > 1) {
                C19290510dT.LIZLLL("LeftAvatarAssem", "[selectSubscribe] remove existed top icon view");
                FrameLayout frameLayoutKp = ((LeftAvatarAssem) c1402370mb5.l0).kp();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayoutKp, null);
                frameLayoutKp.removeViews(1, childCount - 1);
            }
        } else {
            if (iIntValue > 0 && iIntValue2 > 0) {
                layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2))), 1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2, 1);
            }
            ((LeftAvatarAssem) c1402370mb5.l0).kp().addView(view, layoutParams);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C1402370mb5 c1402370mb5, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        int iIntValue3 = ((Number) obj4).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] avatarRightLabelWidth = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", avatarRightLabelHeight = ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(", avatarRightLabelMargin = ");
        sbLIZ.append(iIntValue3);
        C19290510dT.LIZLLL("LeftSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup.LayoutParams layoutParams = ((LeftSlotAssem) c1402370mb5.l0).lp().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            LeftSlotAssem leftSlotAssem = (LeftSlotAssem) c1402370mb5.l0;
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3))));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
            C786410Ut5.F6(leftSlotAssem.lp(), marginLayoutParams);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C1402370mb5 c1402370mb5, Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Drawable drawable = (Drawable) obj4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] rightImageUrl = ");
        sbLIZ.append(str);
        sbLIZ.append(", rightImageResId = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", rightImageDrawable = ");
        sbLIZ.append(drawable);
        C19290510dT.LIZLLL("RightSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0) {
            C786410Ut5.LLFF(0, ((RightSlotAssem) c1402370mb5.l0).mp());
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
            c1331670kl3LJIIIIZZ.LJJ(((RightSlotAssem) c1402370mb5.l0).mp());
            c1331670kl3LJIIIIZZ.LIZLLL("rightCover");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        } else if (iIntValue > 0) {
            C786410Ut5.LLFF(0, ((RightSlotAssem) c1402370mb5.l0).mp());
            ((RightSlotAssem) c1402370mb5.l0).mp().setImageResource(iIntValue);
        } else if (drawable != null) {
            C786410Ut5.LLFF(0, ((RightSlotAssem) c1402370mb5.l0).mp());
            ((RightSlotAssem) c1402370mb5.l0).mp().setImageDrawable(drawable);
        } else {
            C786410Ut5.LLFF(8, ((RightSlotAssem) c1402370mb5.l0).mp());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1402370mb5 c1402370mb5, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJJI(((C1365110lcz) c1402370mb5.l0).LIZJ, iIntValue, (String) obj, ((Boolean) obj3).booleanValue(), (Map) obj4, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }
}
