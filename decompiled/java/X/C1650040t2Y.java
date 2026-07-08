package X;

import a6n.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.gamora.PageFactory;
import com.zhiliaoapp.musically.R;
import lnn.q;

/* JADX INFO: renamed from: X.0t2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650040t2Y extends AbstractC1650160t2k implements InterfaceC484050IyZ {
    public View LLJJI;
    public final ShortVideoContext LLJJIII;
    public C1DRG LLJJIJI;

    @Override // X.AbstractC1650160t2k, com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LiveData<Float> getZoomEvent() {
        return null;
    }

    @Override // X.AbstractC1650160t2k
    public final C1DRG getDiContainer() {
        if (this.LLJJIJI == null) {
            this.LLJJIJI = C1664600tQ2.LJIIIZ(this);
        }
        return this.LLJJIJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onAttach() {
        super.onAttach();
        C530750Krh.LIZIZ(requireApplicationContext());
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        ((FTCVideoRecordNewActivity) requireActivity()).T4(this);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C524780Ki4.LIZ.end("av_video_record_init", "PlanC onResume");
        RecordTaskManager.LIZIZ(EnumC19367310pr.RECORD_ON_UI_SHOW);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C214937199r scope = C1447800nmM.LIZIZ(this).getScope();
        Activity activity = this.mActivity;
        final FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) activity;
        a aVar = new a(false, null, null, fTCVideoRecordNewActivity.LLLF);
        aVar.LJ = this;
        aVar.LJFF = (C19EG) activity;
        aVar.LJI = LLLLIIIILLL().LL;
        aVar.LJII = fTCVideoRecordNewActivity.LLJZ.St2().getMediaController();
        aVar.LJIIIIZZ = fTCVideoRecordNewActivity.LLJZ;
        aVar.LJIIIZ = fTCVideoRecordNewActivity.LLJZIJLIL;
        aVar.LJIIJ = new C01GW<q>() { // from class: X.0t2O
            @Override // X.C01GW
            public final q getValue() {
                return fTCVideoRecordNewActivity.LLZLLLL();
            }

            @Override // X.C01GW
            public final boolean isInitialized() {
                return fTCVideoRecordNewActivity.LLZLLLL() != null;
            }
        };
        aVar.LJIIJJI = (InterfaceC1644770su3) fTCVideoRecordNewActivity.LLJ.LJII(InterfaceC1644770su3.class, null);
        aVar.LJIIL = fTCVideoRecordNewActivity.LLJILLL;
        aVar.LJIILIIL = "VideoRecordNewActivity";
        scope.LJI("record_env_context", aVar);
        C1447800nmM.LIZIZ(this).LLLIIIIL(this, new InterfaceC214930199k() { // from class: X.0t2Z
            @Override // X.InterfaceC214930199k
            public final void LLJJI(Scene scene, Scene scene2, boolean z) {
                if (z) {
                    if (scene2 instanceof C1657620tEm) {
                        C1645630svR.LIZ = true;
                        C786410Ut5.LJLLLLLL(8, this.LL.findViewById(R.id.szh));
                        C786410Ut5.LJLLLLLL(8, this.LL.LLJJI);
                        C1645630svR.LIZ = false;
                        return;
                    }
                    return;
                }
                if (!(scene instanceof C1657620tEm)) {
                    return;
                }
                C1645630svR.LIZ = true;
                C786410Ut5.LJLLLLLL(0, this.LL.LLJJI);
                C786410Ut5.LJLLLLLL(0, this.LL.findViewById(R.id.szh));
                C1645630svR.LIZ = false;
            }
        });
        InterfaceC1642900sr2 interfaceC1642900sr2LIZ = ((PageFactory) ServiceManager.get().getService(PageFactory.class)).LIZ(null);
        if (interfaceC1642900sr2LIZ != null) {
            interfaceC1642900sr2LIZ.LIZ(this);
        }
        ((AbstractActivityC1674880tgc) requireActivity()).LLLZLZ();
    }

    public C1650040t2Y(Intent intent, ShortVideoContext shortVideoContext) {
        this.LLJJIII = shortVideoContext;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.mArguments = extras;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        com.ss.android.ugc.aweme.shortvideo.component.a aVar = (com.ss.android.ugc.aweme.shortvideo.component.a) getDiContainer().LJIIL(null, com.ss.android.ugc.aweme.shortvideo.component.a.class);
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1650160t2k, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C201955140j.LIZ("planC => onCreateView start");
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.cc7, viewGroup, false);
        this.LLJJI = viewGroup2.findViewById(R.id.tsc);
        ((FTCVideoRecordNewActivity) this.mActivity).Qh(this);
        C524780Ki4.LIZ.step("av_video_record_init", "PlanC onCreateView");
        C201955140j.LIZ("planC => onCreateView end");
        return viewGroup2;
    }
}
