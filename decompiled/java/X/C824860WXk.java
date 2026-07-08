package X;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824860WXk extends C19EF {
    public final /* synthetic */ Function0<List<Fragment>> LIZIZ;
    public final /* synthetic */ Function2<AbstractC813200VvC, Boolean, Unit> LIZJ;
    public final /* synthetic */ Function1<AbstractC813200VvC, Unit> LIZLLL;

    @Override // androidx.fragment.app.FragmentManager
    public final List<Fragment> LJJLIIIJL() {
        return this.LIZIZ.invoke();
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void LLIILZL(AbstractC813200VvC abstractC813200VvC) {
        this.LIZLLL.invoke(abstractC813200VvC);
    }

    @Override // androidx.fragment.app.FragmentManager
    public final void LJZL(AbstractC813200VvC abstractC813200VvC, boolean z) {
        this.LIZJ.invoke(abstractC813200VvC, Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C824860WXk(final FragmentManager fragmentManager, Function0<? extends List<? extends Fragment>> function0, Function2<? super AbstractC813200VvC, ? super Boolean, Unit> function2, Function1<? super AbstractC813200VvC, Unit> function1) {
        new FragmentManager(fragmentManager) { // from class: X.19EF
            public final FragmentManager LIZ;

            @Override // androidx.fragment.app.FragmentManager
            public final void LLFFF(Parcelable parcelable) {
                throw null;
            }

            @Override // androidx.fragment.app.FragmentManager
            public final int LJII() {
                return this.LIZ.LJII();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final C19EH LJIIJ() {
                return this.LIZ.LJIIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJIIJJI() {
                return this.LIZ.LJIIJJI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIIZILJ() {
                this.LIZ.LJIIZILJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIJ() {
                this.LIZ.LJIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIJJLI() {
                this.LIZ.LJIJJLI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJ() {
                this.LIZ.LJJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJI() {
                this.LIZ.LJJI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIJ() {
                this.LIZ.LJJIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIJIL() {
                this.LIZ.LJJIJIL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIJL() {
                this.LIZ.LJJIJL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIJLIJ() {
                this.LIZ.LJJIJLIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIZ() {
                this.LIZ.LJJIZ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJJ() {
                this.LIZ.LJJJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJJJJL() {
                return this.LIZ.LJJJJL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final int LJJLIIIIJ() {
                return this.LIZ.LJJLIIIIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final C19F6 LJJLIIIJ() {
                return this.LIZ.LJJLIIIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final C20135813qW LJJLIIIJJIZ() {
                return this.LIZ.LJJLIIIJJIZ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final AnonymousClass1996<?> LJJLIIIJLJLI() {
                return this.LIZ.LJJLIIIJLJLI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final LayoutInflater.Factory2 LJJLIIIJLLLLLLLZ() {
                return this.LIZ.LJJLIIIJLLLLLLLZ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final C19CY LJJLIIJ() {
                return this.LIZ.LJJLIIJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJLIL() {
                return this.LIZ.LJJLIL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJLJ() {
                return this.LIZ.LJJLJ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final AnonymousClass1902 LJJLJLI() {
                return this.LIZ.LJJLJLI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJZ() {
                this.LIZ.LJJZ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJL() {
                return this.LIZ.LJL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLJI() {
                return this.LIZ.LJLJI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLJJI() {
                return this.LIZ.LJLJJI();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLJLLL() {
                this.LIZ.LJLJLLL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLLILLLL() {
                this.LIZ.LJLLILLLL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLLL() {
                return this.LIZ.LJLLL();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Parcelable LLFZ() {
                return this.LIZ.LLFZ();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLII() {
                this.LIZ.LLII();
            }

            @Override // androidx.fragment.app.FragmentManager
            public final String toString() {
                return this.LIZ.toString();
            }

            {
                this.LIZ = fragmentManager;
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LIZJ(a aVar) {
                this.LIZ.LIZJ(aVar);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final C19EC LIZLLL(Fragment fragment) {
                return this.LIZ.LIZLLL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJ(InterfaceC1840220xzI interfaceC1840220xzI) {
                this.LIZ.LJ(interfaceC1840220xzI);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJFF(InterfaceC21506019Ek interfaceC21506019Ek) {
                this.LIZ.LJFF(interfaceC21506019Ek);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJI(Fragment fragment) {
                this.LIZ.LJI(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIIIZ(Fragment fragment) {
                this.LIZ.LJIIIZ(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final C19EC LJIILL(Fragment fragment) {
                return this.LIZ.LJIILL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIILLIIL(Fragment fragment) {
                this.LIZ.LJIILLIIL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJIJJ(MenuItem menuItem) {
                return this.LIZ.LJIJJ(menuItem);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIFFI(boolean z) {
                this.LIZ.LJJIFFI(z);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIII(Fragment fragment) {
                this.LIZ.LJJIII(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJJIIJZLJL(MenuItem menuItem) {
                return this.LIZ.LJJIIJZLJL(menuItem);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIIZ(Menu menu) {
                this.LIZ.LJJIIZ(menu);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJJIJIIJIL(Menu menu) {
                return this.LIZ.LJJIJIIJIL(menu);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJJJJIZL(boolean z) {
                return this.LIZ.LJJJJIZL(z);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJJJLI(String str) {
                return this.LIZ.LJJJJLI(str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJJJZ(int i) {
                return this.LIZ.LJJJJZ(i);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJJJZI(String str) {
                return this.LIZ.LJJJJZI(str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJJLIIL(String str) {
                return this.LIZ.LJJJLIIL(str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final InterfaceC988103tf LJJLI(int i) {
                return this.LIZ.LJJLI(i);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final ViewModelStore LJJLL(Fragment fragment) {
                return this.LIZ.LJJLL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJZZI(Fragment fragment) {
                this.LIZ.LJJZZI(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJZZIII(Fragment fragment) {
                this.LIZ.LJJZZIII(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLIL(Fragment fragment) {
                return this.LIZ.LJLIL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLILLLLZI(Fragment fragment) {
                return this.LIZ.LJLILLLLZI(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLLI(C19EC c19ec) {
                this.LIZ.LJLLI(c19ec);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLLLL(int i) {
                return this.LIZ.LJLLLL(i);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LL(Fragment fragment) {
                this.LIZ.LL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLD(InterfaceC21506019Ek interfaceC21506019Ek) {
                this.LIZ.LLD(interfaceC21506019Ek);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLFF(Fragment fragment) {
                this.LIZ.LLFF(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment.SavedState LLIFFJFJJ(Fragment fragment) {
                return this.LIZ.LLIFFJFJJ(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLIIIZ(Fragment fragment) {
                this.LIZ.LLIIIZ(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLIIJLIL(Fragment fragment) {
                this.LIZ.LLIIJLIL(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIJI(boolean z, Configuration configuration) {
                this.LIZ.LJIJI(z, configuration);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJIL(Menu menu, MenuInflater menuInflater) {
                return this.LIZ.LJIL(menu, menuInflater);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJII(boolean z, boolean z2) {
                this.LIZ.LJJII(z, z2);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJIJIIJI(boolean z, boolean z2) {
                this.LIZ.LJJIJIIJI(z, z2);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJJJ(InterfaceC21506619Eq interfaceC21506619Eq, boolean z) {
                this.LIZ.LJJJJ(interfaceC21506619Eq, z);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJJJJ(InterfaceC21506619Eq interfaceC21506619Eq, boolean z) {
                this.LIZ.LJJJJJ(interfaceC21506619Eq, z);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final Fragment LJJLIIIJILLIZJL(Bundle bundle, String str) {
                return this.LIZ.LJJLIIIJILLIZJL(bundle, str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLJLJ(int i, boolean z) {
                String name;
                try {
                    this.LIZ.LJLJLJ(i, z);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF == null) {
                            name = "";
                        } else {
                            name = activityLJFF.getClass().getName();
                        }
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("always", Boolean.valueOf(z));
                        c2241008qG.LIZ.put("newState", Integer.valueOf(i));
                        c2241008qG.LIZ.put("currentActivity", name);
                        c2241008qG.LIZ.put("errorMsg", Log.getStackTraceString(e));
                        JSONObject jSONObjectLJ = c2241008qG.LJ();
                        C2241008qG c2241008qG2 = new C2241008qG();
                        c2241008qG2.LIZ.put("errorDesc", jSONObjectLJ.toString());
                        c2241008qG2.LIZ.put("always", Boolean.valueOf(z));
                        C794420VEi.LIZIZ("fragment_crash_log", "", c2241008qG2.LJ());
                        System.err.println("always ---> " + z);
                        System.err.println("fragment_crash_log ---> " + jSONObjectLJ);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLLJ(int i, String str) {
                this.LIZ.LJLLJ(i, str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJLZ(int i, String str) {
                return this.LIZ.LJLZ(i, str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLIIII(Fragment fragment, boolean z) {
                this.LIZ.LLIIII(fragment, z);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LLIIIL(Fragment fragment, Lifecycle.State state) {
                this.LIZ.LLIIIL(fragment, state);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJIIIIZZ(AnonymousClass1996<?> anonymousClass1996, C19F6 c19f6, Fragment fragment) {
                this.LIZ.LJIIIIZZ(anonymousClass1996, c19f6, fragment);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLJJL(Fragment fragment, String[] strArr, int i) {
                this.LIZ.LJLJJL(fragment, strArr, i);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJZI(Bundle bundle, Fragment fragment, String str) {
                this.LIZ.LJZI(bundle, fragment, str);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJJJI(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                this.LIZ.LJJJI(str, fileDescriptor, printWriter, strArr);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLJJLL(Fragment fragment, Intent intent, int i, Bundle bundle) {
                this.LIZ.LJLJJLL(fragment, intent, i, bundle);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final boolean LJZ(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
                return this.LIZ.LJZ(arrayList, arrayList2, str, i, i2);
            }

            @Override // androidx.fragment.app.FragmentManager
            public final void LJLJL(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
                this.LIZ.LJLJL(fragment, intentSender, i, intent, i2, i3, i4, bundle);
            }
        };
        this.LIZIZ = function0;
        this.LIZJ = function2;
        this.LIZLLL = function1;
    }
}
