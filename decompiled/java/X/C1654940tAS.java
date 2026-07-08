package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654940tAS extends AbstractC1653180t7c implements InterfaceC379610EuV {
    public final C1DRG LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(473));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 890));
    public boolean LLJJIII;

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "RecordLiveScene";
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        InterfaceC1655130tAl interfaceC1655130tAl;
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C128Y c128y = (Scene) this.LLJJI.getValue();
        if (!(c128y instanceof InterfaceC1655130tAl) || (interfaceC1655130tAl = (InterfaceC1655130tAl) c128y) == null) {
            return;
        }
        interfaceC1655130tAl.onHide();
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        InterfaceC1655130tAl interfaceC1655130tAl;
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (this.LLJJIII) {
            C128Y c128y = (Scene) this.LLJJI.getValue();
            if (!(c128y instanceof InterfaceC1655130tAl) || (interfaceC1655130tAl = (InterfaceC1655130tAl) c128y) == null) {
                return;
            }
            interfaceC1655130tAl.onShow();
            return;
        }
        this.LLJJIII = true;
        this.mArguments = C1653510t89.LIZ((ShortVideoContext) this.LLJILLL.LJIIL(null, ShortVideoContext.class));
        Scene scene = (Scene) this.LLJJI.getValue();
        if (scene != null) {
            add(R.id.mmo, scene, "LightRecordLiveTabScene");
        }
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.RECORD_LIVE_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C1654940tAS(C1DRG c1drg) {
        this.LLJILLL = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC1655020tAa interfaceC1655020tAa = (InterfaceC1655020tAa) this.LLJJ.getValue();
        if (interfaceC1655020tAa != null) {
            interfaceC1655020tAa.LIZ(this);
        }
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(R.id.mmo);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
