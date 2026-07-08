package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650120t2g extends AbstractC1653180t7c implements InterfaceC379610EuV {
    public final C1DRG LLJILLL;

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "StoryTabScene";
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.NON_COVER_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C1650120t2g(C1DRG c1drg) {
        this.LLJILLL = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(249));
        C1664590tQ1.LIZLLL(this, "StoryTabScene", false, AFwS266S0000000_25.get$arr$(250), 2);
        C1664600tQ2.LIZ(this, "StoryTabScene", new AwS604S0100000_25(this, 317));
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.erq, viewGroup, false);
    }
}
