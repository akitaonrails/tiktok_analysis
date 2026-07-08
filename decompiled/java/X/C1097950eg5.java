package X;

import Y.ARunnableS21S0400000_12;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0eg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097950eg5 extends ConstraintLayout implements C0ULX, InterfaceC1141530foN {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public final FrameLayout LLILLJJLI;
    public BannerInRoomCollection.BannerInfo LLILLL;
    public List<? extends BannerInRoom> LLILZ;
    public boolean LLILZIL;
    public LifecycleOwner LLILZLL;
    public boolean LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;

    @Override // X.C0ULX
    public final boolean LLZLLLL(int i, Object obj) {
        return false;
    }

    @Override // X.C0ULX
    public final void onDetach() {
    }

    @Override // X.C0ULX
    public final void onHide() {
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        C1097990eg9.LIZIZ = null;
        C1548820qPI.LJIIIIZZ("js_event_banner_ready_live", this);
    }

    @Override // X.C0ULX
    public final void onPause() throws JSONException {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_disappear", new JSONObject());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", false));
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "H5_appStateChange", jSONObject);
        }
    }

    @Override // X.C0ULX
    public final void onResume() throws JSONException {
        if (!this.LLILZIL) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_appear", new JSONObject());
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "H5_appStateChange", jSONObject);
            }
        }
        this.LLILZIL = false;
    }

    @Override // X.C0ULX
    public final void onShow() throws JSONException {
        BannerInRoomCollection.BannerInfo bannerInfo;
        List<? extends BannerInRoom> list = this.LLILZ;
        if (list == null || (bannerInfo = this.LLILLL) == null) {
            return;
        }
        C1548820qPI.LIZLLL("js_event_banner_ready_live", this);
        C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
        c1098010egBLIZIZ.LIZ("live_take_page", "event_page");
        c1098010egBLIZIZ.LIZ(0, "render_strategy");
        c1098010egBLIZIZ.LJIIL = 0;
        ArrayList arrayList = (ArrayList) list;
        c1098010egBLIZIZ.LIZJ(arrayList.size(), arrayList.size());
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jSONArray = jSONArray.put(((BannerInRoom) it2.next()).id);
        }
        String string = jSONArray.toString();
        c1098010egBLIZIZ.LIZ(string, "origin_banner_ids");
        c1098010egBLIZIZ.LIZ(string, "render_banner_ids");
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        String str = bannerInfo.lynxContainerUrl;
        C0KYM c0kym = new C0KYM();
        c0kym.LJI(str);
        c0kym.LIZIZ.authority("lynxview");
        c0kym.LJFF(true);
        String string2 = c0kym.LIZ().toString();
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1098010egB c1098010egBLIZIZ2 = C1097990eg9.LIZIZ();
        c1098010egBLIZIZ2.LJ = "lynx";
        c1098010egBLIZIZ2.LJII = System.currentTimeMillis();
        c1098010egBLIZIZ2.LIZLLL = str;
        c1098010egBLIZIZ2.LIZJ = string2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(getContext(), string2, null, true, new AwS596S0100000_17(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        C1097990eg9.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
        c1097990eg9.LIZLLL(C2097608Jq.LJ());
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.exe, getContext()));
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exe, frameLayout2.getContext()));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setClipToOutline(true);
        }
        FrameLayout frameLayout3 = this.LLILLJJLI;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.LL, -1, -1);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_appear", new JSONObject());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", true));
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, "H5_appStateChange", jSONObject);
        }
        C500260Jjc.LLFFF(findViewById(R.id.br9));
    }

    public final ImageView getMountainPointer() {
        return (ImageView) findViewById(R.id.b39);
    }

    @Override // X.C0ULX
    public View getBannerView() {
        return this.LL;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJJI = System.currentTimeMillis();
        c1097990eg9.LJI();
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R.id.br9);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS383S0200000_17(onClickListener, this, 52));
        }
    }

    @Override // X.C0ULX
    public final void LJZI(View view, Function0<Unit> function0) {
        if (view == null) {
            C500260Jjc.LJLJL(C439101nJ.LIZ(8), this.LLILLJJLI);
        } else {
            FrameLayout frameLayout = this.LLILLJJLI;
            if (frameLayout == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS21S0400000_12(frameLayout, view, this, function0, 5));
        }
    }

    public C1097950eg5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = true;
        this.LLIZ = true;
        this.LLIZLLLIL = C439101nJ.LIZ(20);
        this.LLJ = C439101nJ.LIZ(12);
        C500260Jjc.LJIILL(R.layout.hgz, this, true);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.vsu);
    }

    @Override // X.C0ULX
    public final boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        BannerInRoomCollection.BannerInfo bannerInfo;
        this.LLILZLL = lifecycleOwner;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null && (bannerInfo = roomCreateInfo.bannerInfo) != null) {
            this.LLILLL = bannerInfo;
            List<BannerInRoom> list = bannerInfo.bannerList;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (BannerInRoom bannerInRoom : list) {
                    if (bannerInRoom.bannerLocation == 6) {
                        arrayList.add(bannerInRoom);
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                this.LLILZ = arrayList;
                return true;
            }
        }
        return false;
    }
}
