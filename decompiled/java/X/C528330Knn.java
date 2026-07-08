package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.optimization.PreloadContextReplaceHelper;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0101100_8;
import kotlin.jvm.internal.AwS19S1201000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS48S1300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Knn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528330Knn extends AbstractC528270Knh implements InterfaceC528520Ko6 {
    public TextView LLLLLLJ;
    public ViewOnClickListenerC20639415pY LLLLLLL;
    public ViewStub LLLLLLLLL;
    public InterfaceC523820KgW LLLLLLLLLL;
    public InterfaceC528410Knv LLLLLLLZIL;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public ACListenerS143S0100000_8 LLLLLZIL;
    public ACListenerS143S0100000_8 LLLLLZL;
    public C525370Kj1 LLLLZ;
    public boolean LLLLZIL;
    public boolean LLLLLLZ = true;
    public long LLLLZI = C566050MHz.LIZIZ();
    public final C01GW LLLLZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 274));
    public final C01GW LLLLZLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 273));
    public boolean LLLLZLLLI = true;

    @Override // X.AbstractC528270Knh
    public final void LLLZ() {
        this.LLLFZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C528630KoH.LIZ);
    }

    @Override // X.AbstractC528270Knh
    public final void LLLZI() {
        ViewStub viewStub;
        if (this.LLJJL != null || (viewStub = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        C786410Ut5.LJLLLL(viewStub);
        this.LLJJL = this.LLJJJJJIL.findViewById(R.id.kdb);
    }

    public final boolean LLZ() {
        Bundle bundle = this.mArguments;
        if (bundle == null || !bundle.getBoolean("forbid_init_multi_mode", false)) {
            if (this.LLLLLLZ) {
                C533730KwV.LIZ.getClass();
                if (!C533730KwV.LIZJ()) {
                }
                return true;
            }
            C533730KwV c533730KwV = C533730KwV.LIZ;
            int i = this.LLLLJI;
            c533730KwV.getClass();
            if (C533730KwV.LIZLLL(i, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEditorProReplace() {
        BaseBundle baseBundle;
        return this.LLLLJI == 14 && (baseBundle = (BaseBundle) this.LLLLZLLIL.getValue()) != null && baseBundle.getBoolean("Key_replace_item", false);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (!LLLLLL().LIZ()) {
            LLLZLZ(false, false);
            return;
        }
        LLLZLZ(true, false);
        if (!LLLLLL().LIZIZ()) {
            if (C523360Kfm.LIZJ()) {
                LLLLIL(1008);
            }
        } else {
            C525370Kj1 c525370Kj1 = this.LLLLZ;
            if (c525370Kj1 != null) {
                c525370Kj1.invoke();
            }
        }
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        if (z) {
            LLLZLZ(LLLLLL().LIZ(), true);
        }
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLLZIL(boolean z) {
        LLLZZIL(false);
    }

    public final void LLLZZIL(boolean z) {
        String str;
        this.LLLLLLZ = z;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLIL(z);
        }
        this.LLJZ = z;
        if (this.mActivity != null) {
            InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLLZLL.getValue();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            interfaceC528880Kog.setEnterFrom(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528330Knn.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLIL(List<? extends TikTokMediaModel> list, boolean z) {
        if (list == null) {
            return;
        }
        LLLLIL(1008);
        if (list.isEmpty()) {
            TextView textView = null;
            if (this.LLLLLLJ == null) {
                ViewStub viewStub = this.LLLLLLLLL;
                if (viewStub == null) {
                    viewStub = null;
                }
                C786410Ut5.LJLLLL(viewStub);
                this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.p_c);
            }
            TextView textView2 = this.LLLLLLJ;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 0);
            TextView textView3 = this.LLLLLLJ;
            if (textView3 != null) {
                textView = textView3;
            }
            textView.setText(2131829005);
            if (this.LLLI) {
                C524780Ki4.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                this.LLLI = false;
            }
        } else {
            TextView textView4 = this.LLLLLLJ;
            if (textView4 != null) {
                C786410Ut5.LLIL(textView4, 8);
            }
        }
        if (z) {
            this.LLJJJ.setData(list);
        } else {
            this.LLJJJ.LLLLLLZ(list);
        }
        if (C522610KeZ.LIZ()) {
            int i = this.LLLLJI;
            if (i == 3 || i == 4) {
                C0DVE.LIZ(list, C528500Ko4.LIZ, this.LLJJJIL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0241  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, android.graphics.drawable.Drawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528330Knn.LLLZLZ(boolean, boolean):void");
    }

    public final boolean LLZL(View view, MediaModel mediaModel) {
        boolean z;
        if (mediaModel == null || view == null || this.LLLLLLZZ) {
            return false;
        }
        this.LLLLLLZZ = true;
        if (this.LLLLJI != 15) {
            z = true;
        } else {
            z = false;
        }
        LLLZZ(true, z, mediaModel, -1, new AwS252S0300000_8(this, (TikTokMediaModel) mediaModel, view, 13));
        return true;
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLL(int i, int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LLLLLJLJLL()) {
            C0CNO.LIZ(C15O7.LJI, new AwS12S0101100_8(jCurrentTimeMillis, this, i, 1));
            return;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(jCurrentTimeMillis - this.LLLF.longValue(), "duration");
        c0lab.LIZ(1, "type");
        c0lab.LJ("shoot_way", this.LLLIIIIL);
        c0lab.LIZ(i, "count");
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2;
        char c;
        C128Y currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(requireActivity());
        if (LLLLLJLJLL()) {
            i = R.layout.i8p;
        } else {
            i = R.layout.i8o;
        }
        if (C524870KiD.LIZ() && (currentScene instanceof InterfaceC530790Krl)) {
            viewGroup2 = (ViewGroup) C530780Krk.LIZ((InterfaceC530790Krl) currentScene, i, this);
        } else if (C297760Blm.LIZ() && C300110BpZ.LIZ()) {
            Context contextRequireSceneContext = requireSceneContext();
            viewGroup2 = (ViewGroup) C21146717pB.LIZIZ(contextRequireSceneContext, i, viewGroup, false);
            PreloadContextReplaceHelper.replaceAfterInflate(viewGroup2, contextRequireSceneContext, false, viewGroup);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        this.LLJJJJJIL = viewGroup2;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.j5o);
        this.LLJJJIL = recyclerView;
        recyclerView.setRecycledViewPool(C535480KzK.LIZ(this));
        if (LLLLLJLJLL()) {
            this.LLJJLIIIJLLLLLLLZ = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_loading);
            this.LLLLLLLLL = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_empty_content);
        } else {
            this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.zpi);
            this.LLJJL = this.LLJJJJJIL.findViewById(R.id.video_loading);
        }
        int i2 = 8;
        if (this.LLLLLLZ && !this.LLJZ) {
            c = 0;
        } else {
            c = '\b';
        }
        if (!LLZ() && c == 0) {
            C786410Ut5.LJLLLL((ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_multi_select_view));
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = (ViewOnClickListenerC20639415pY) this.LLJJJJJIL.findViewById(R.id.opn);
            this.LLLLLLL = viewOnClickListenerC20639415pY;
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY2 = null;
            if (viewOnClickListenerC20639415pY == null) {
                viewOnClickListenerC20639415pY = null;
            }
            if (this.LLLLLLZ && !this.LLJZ) {
                i2 = 0;
            }
            C786410Ut5.H0(viewOnClickListenerC20639415pY, i2);
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY3 = this.LLLLLLL;
            if (viewOnClickListenerC20639415pY3 != null) {
                viewOnClickListenerC20639415pY2 = viewOnClickListenerC20639415pY3;
            }
            viewOnClickListenerC20639415pY2.setOnModeChangeListener(new InterfaceC20639515pZ() { // from class: X.0Knu
                @Override // X.InterfaceC20639515pZ
                public final void LIZ(boolean z) {
                    this.LIZ.LLJJJ.LLLLLLIL(z);
                    if (z) {
                        C528330Knn c528330Knn = this.LIZ;
                        ((InterfaceC528880Kog) c528330Knn.LLLLZLL.getValue()).setEnterFrom("enter_from_multi");
                        InterfaceC523820KgW interfaceC523820KgW = c528330Knn.LLLLLLLLLL;
                        if (interfaceC523820KgW != null) {
                            interfaceC523820KgW.LIZ(true);
                            return;
                        }
                        return;
                    }
                    C528330Knn c528330Knn2 = this.LIZ;
                    ((InterfaceC528880Kog) c528330Knn2.LLLLZLL.getValue()).setEnterFrom("enter_from_single");
                    InterfaceC523820KgW interfaceC523820KgW2 = c528330Knn2.LLLLLLLLLL;
                    if (interfaceC523820KgW2 == null) {
                        return;
                    }
                    interfaceC523820KgW2.LIZ(false);
                }
            });
        }
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 instanceof C540760LIs) {
            ((C540760LIs) recyclerView2).setFastScrollEnabled(true);
            ((C540760LIs) this.LLJJJIL).setFastScrollListener(this.LLLLLJLJLL);
        }
        LLLZLZ(LLLLLL().LIZ(), false);
        return this.LLJJJJJIL;
    }

    public final void LLLZZ(boolean z, boolean z2, MediaModel mediaModel, int i, Function0<Unit> function0) {
        String str;
        long j;
        boolean z3;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.LLLLZI;
        }
        InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLLZLL.getValue();
        long j2 = i;
        if (this.LLLLJI != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC528880Kog.LIZ(mediaModel, z2, j, j2, z3, false, false, new AwS48S1300000_8(mediaModel, (MediaModel) this, (C528330Knn) str, (String) function0, (Function0<Unit>) 1), new AwS19S1201000_8(mediaModel, this, str, i, 1));
    }

    public static final void LLZIL(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
            c543670LTx.LIZ.put("scene_name", str2);
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(i2));
            c543670LTx.LIZ.put("type", str);
            c543670LTx.LIZ.put("width", Integer.valueOf(mediaModel.width));
            c543670LTx.LIZ.put("height", Integer.valueOf(mediaModel.height));
            C1637890six.LIZJ("aweme_video_import_duration", jSONObject, c543670LTx.LJ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
