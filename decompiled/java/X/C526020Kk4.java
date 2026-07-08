package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Kk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526020Kk4 extends C19A3 {
    public final int LLJILLL;
    public final C1664690tQB<C525990Kk1> LLJJ;
    public ViewGroup LLJJI;

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJI = (ViewGroup) findViewById(R.id.av8);
        this.LLJJ.LIZ(new C2217381BqS() { // from class: X.0Kk3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C525990Kk1) obj).LIZ);
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 94));
        this.LLJJ.LIZ(new C2217381BqS() { // from class: X.0Kk2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C525990Kk1) obj).LIZIZ);
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 95));
    }

    public C526020Kk4(int i, C1664680tQA c1664680tQA) {
        this.LLJILLL = i;
        this.LLJJ = c1664680tQA;
        disableSupportRestore();
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, this.LLJILLL, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
