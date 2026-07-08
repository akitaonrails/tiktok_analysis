package X;

import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.AIRemixAction$onIconViewAttachedToWindow$1", f = "AIRemixAction.kt", l = {191}, m = "invokeSuspend")
public final class C445650Hdj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0M7S LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445650Hdj(C0M7S c0m7s, boolean z, View view, InterfaceC1364105Vn<? super C445650Hdj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0m7s;
        this.LLILZ = z;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C445650Hdj c445650Hdj = new C445650Hdj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c445650Hdj.LLILLJJLI = obj;
        return c445650Hdj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Dialog dialog;
        Window window;
        ViewGroup viewGroup;
        List listLJJII;
        C1C7U.LIZ("AIRemixAction@3cc4.onIconViewAttachedToWindow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C0M7D c0m7d = this.LLILLL.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (c0m7d.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("AIRemixAction@3cc4.onIconViewAttachedToWindow$1");
                return objLJFF;
            }
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIRemixAction@3cc4.onIconViewAttachedToWindow$1");
            return unit;
        }
        if (this.LLILZ == this.LLILLL.enable()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AIRemixAction@3cc4.onIconViewAttachedToWindow$1");
            return unit2;
        }
        C0M7S c0m7s = this.LLILLL;
        Context context = this.LLILZIL.getContext();
        if (c0m7s.LLJ >= 0) {
            Activity activityLIZ = C085T.LIZ(context);
            Object obj2 = null;
            if ((activityLIZ instanceof C19GS) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
                Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("SKELETON_SHARE_FRAGMENT");
                if ((fragmentLJJJJZI instanceof DialogFragment) && (dialog = ((DialogFragment) fragmentLJJJJZI).getDialog()) != null && (window = dialog.getWindow()) != null) {
                    View viewFindViewById = window.getDecorView().findViewById(R.id.nhk);
                    if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null && (listLJJII = C09RB.LJJII(new C09RD(viewGroup))) != null) {
                        Iterator it2 = listLJJII.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (next instanceof C1369740lkS) {
                                obj2 = next;
                                break;
                            }
                        }
                        View view = (View) obj2;
                        if (view != null) {
                            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.a3x);
                            if (recyclerView.isComputingLayout()) {
                                C786410Ut5.LJJZZIII(c0m7s.LLILZLL, new ARunnableS75S0200000_6(c0m7s, recyclerView, 87));
                            } else {
                                c0m7s.LJ(recyclerView);
                            }
                        }
                    }
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixAction@3cc4.onIconViewAttachedToWindow$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
