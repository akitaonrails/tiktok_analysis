package androidx.fragment.app;

import X.C07GT;
import X.C1800500wxE;
import X.C19CP;
import X.C19CY;
import X.C214794194e;
import X.C214798194i;
import X.C214906198m;
import X.C214908198o;
import X.C665300Q7s;
import X.InterfaceC214902198i;
import X.InterfaceC214918198y;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class SAFBaseFragment extends Fragment implements InterfaceC214902198i {
    public static final String _pnsPageId = "KSsoOyA6LD1iLz0yLygpJzt9KTHELIOSU8ZxwSDgctOioVOiQrJCo9PA==";
    public SAFFragmentRootScene LL;
    public final CopyOnWriteArraySet<C19CP> LLILLJJLI = new CopyOnWriteArraySet<>();
    public final C214794194e LLILLL = new C214794194e(new C214798194i());
    public final List<Function1<C19CP, Unit>> LLILZ = new CopyOnWriteArrayList();

    @Override // X.InterfaceC214902198i
    public final void LJLLLL() {
    }

    @Override // X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
    }

    @Override // X.InterfaceC214902198i
    public final boolean SL() {
        return false;
    }

    @Override // X.InterfaceC214902198i
    public final InterfaceC214918198y U5() {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public final void YP() {
    }

    @Override // X.InterfaceC214902198i
    public final Boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public final Boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public final void gv(int i, String[] strArr, int[] iArr) {
    }

    @Override // X.InterfaceC214902198i
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.InterfaceC214902198i
    public final Boolean onKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public final Boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public final Boolean onKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // X.InterfaceC214902198i
    public final void pg(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC214902198i
    public final void tM() {
    }

    @Override // X.InterfaceC214902198i
    public final void zd() {
    }

    public final void MR() {
        for (Function1 function1 : this.LLILZ) {
            Iterator<C19CP> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                function1.invoke(it2.next());
            }
        }
        ((CopyOnWriteArrayList) this.LLILZ).clear();
    }

    public final C19CY NR() {
        FragmentManager fragmentManager;
        SAFFragmentRootScene sAFFragmentRootScene = this.LL;
        if (sAFFragmentRootScene == null || (fragmentManager = sAFFragmentRootScene.getFragmentManager()) == null) {
            return null;
        }
        return fragmentManager.LJJLIIJ();
    }

    @Override // X.InterfaceC214902198i
    public final boolean W1() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LL;
        if (sAFFragmentRootScene != null) {
            return sAFFragmentRootScene.W1();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        OR(new AwS614S0100000_35(this, 16));
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        OR(new AwS614S0100000_35(this, 18));
        super.onPause();
    }

    @Override // X.InterfaceC214902198i
    public final void onRelease() {
        OR(new AwS614S0100000_35(this, 19));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        OR(new AwS614S0100000_35(this, 20));
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        OR(new AwS614S0100000_35(this, 21));
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        OR(new AwS614S0100000_35(this, 22));
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void performAttach() {
        PR(new AwS579S0100000_35(this, 14));
        super.performAttach();
        PR(new AwS579S0100000_35(this, 15));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performDestroy() {
        OR(new AwS614S0100000_35(this, 23));
        super.performDestroy();
        OR(new AwS614S0100000_35(this, 24));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performPause() {
        OR(new AwS614S0100000_35(this, 25));
        super.performPause();
        OR(new AwS614S0100000_35(this, 26));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performResume() {
        OR(new AwS614S0100000_35(this, 27));
        super.performResume();
        OR(new AwS614S0100000_35(this, 28));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performStart() {
        OR(new AwS614S0100000_35(this, 29));
        super.performStart();
        OR(new AwS614S0100000_35(this, 30));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performStop() {
        OR(new AwS614S0100000_35(this, 31));
        super.performStop();
        OR(new AwS614S0100000_35(this, 15));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performViewCreated() {
        super.performViewCreated();
        PR(new AwS579S0100000_35(this, 13));
    }

    @Override // X.InterfaceC214902198i
    public final void uk() {
        if (C07GT.LIZ()) {
            return;
        }
        C214906198m.Companion.getClass();
        C214908198o.LIZ(this);
    }

    @Override // X.InterfaceC214902198i
    public final C214794194e ej() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC214902198i
    public final void finish() {
        C1800500wxE.LIZ(this);
    }

    @Override // X.InterfaceC214902198i
    public final SAFFragmentRootScene ib() {
        return this.LL;
    }

    @Override // X.InterfaceC214902198i
    public final void uB() {
        MR();
    }

    @Override // X.InterfaceC214902198i
    public final void zB() {
        uk();
    }

    @Override // X.InterfaceC214902198i
    public final void Ne(SAFFragmentRootScene sAFFragmentRootScene) {
        this.LL = sAFFragmentRootScene;
    }

    public final void OR(Function1<? super C19CP, Unit> function1) {
        if (C665300Q7s.LIZ()) {
            ((CopyOnWriteArrayList) this.LLILZ).add(function1);
            return;
        }
        MR();
        Iterator<C19CP> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    public final void PR(Function0<Unit> function0) {
        if (C665300Q7s.LIZ()) {
            OR(new AwS614S0100000_35(function0, (Function0<Unit>) 17));
        }
    }

    @Override // X.InterfaceC214902198i
    public final void U1(Bundle bundle) {
        OR(new AwS401S0200000_35(this, bundle, 15));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        OR(new AwS401S0200000_35(this, bundle, 14));
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        OR(new AwS401S0200000_35(this, bundle, 16));
        super.onSaveInstanceState(bundle);
        OR(new AwS401S0200000_35(this, bundle, 17));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreate(Bundle bundle) {
        PR(new AwS579S0100000_35(this, 16));
        OR(new AwS401S0200000_35(this, bundle, 18));
        super.performCreate(bundle);
        OR(new AwS401S0200000_35(this, bundle, 19));
        PR(new AwS579S0100000_35(this, 17));
    }

    @Override // androidx.fragment.app.Fragment
    public final void performSaveInstanceState(Bundle bundle) {
        OR(new AwS401S0200000_35(this, bundle, 20));
        super.performSaveInstanceState(bundle);
    }

    @Override // X.InterfaceC214902198i
    public final void rm(C19CP c19cp) {
        this.LLILLJJLI.remove(c19cp);
    }

    @Override // X.InterfaceC214902198i
    public final void uG(C19CP c19cp) {
        this.LLILLJJLI.add(c19cp);
    }
}
