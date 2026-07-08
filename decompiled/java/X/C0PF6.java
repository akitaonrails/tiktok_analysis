package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PF6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PF6 {
    public static final /* synthetic */ C0PF6 LIZ = new C0PF6();

    public static List LIZ(C0NMY c0nmy, final Fragment fragment, final Function0 function0, final C0SZT c0szt, final Function0 function02) {
        List listLIZIZ = C0PH8.LIZIZ(c0nmy);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        int i = 0;
        for (Object obj : listLIZIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                final ISearchCardProtocol iSearchCardProtocol = (ISearchCardProtocol) obj;
                final int i3 = i + 101;
                arrayList.add(new C0PF7(i3, function0, fragment, c0szt, iSearchCardProtocol, function02) { // from class: X.0PSc
                    public final int LIZIZ;
                    public final Function0<Integer> LIZJ;
                    public final LifecycleOwner LIZLLL;
                    public final C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> LJ;
                    public final ISearchCardProtocol<InterfaceC594520NTm> LJFF;
                    public final Function0<InterfaceC665370Q7z> LJI;

                    @Override // X.C0PF7
                    public final int LJFF() {
                        int i4 = C0PHN.LIZ[this.LJFF.getConfig().LIZLLL().ordinal()];
                        if (i4 == 1) {
                            return 1;
                        }
                        if (i4 == 2) {
                            return this.LIZJ.invoke().intValue();
                        }
                        throw new C1954807lC();
                    }

                    @Override // X.C0PF7
                    public final ISearchCardProtocol<InterfaceC594520NTm> getProtocol() {
                        return this.LJFF;
                    }

                    @Override // X.C0PF7
                    public final int getViewType() {
                        return this.LIZIZ;
                    }

                    @Override // X.C0PF7
                    public final SearchCardViewHolder LIZ(Context context, ViewGroup viewGroup) {
                        SearchContextAbilityImpl searchContextAbilityImpl;
                        Float fValueOf;
                        int i4 = SearchCardViewHolder.LLJI;
                        LifecycleOwner lifecycleOwner = this.LIZLLL;
                        C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt2 = this.LJ;
                        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocol2 = this.LJFF;
                        Function0<InterfaceC665370Q7z> function03 = this.LJI;
                        if (context == null) {
                            context = viewGroup.getContext();
                        }
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.euw, viewGroup, false);
                        C646080PVu c646080PVuLIZJ = null;
                        if (iSearchCardProtocol2.getConfig().LIZLLL() == C0PHM.ONE_COLUMN && !C1913207eU.LIZLLL() && (fValueOf = Float.valueOf(C1913207eU.LIZIZ())) != null) {
                            fValueOf.floatValue();
                            C21565319aV.LIZIZ(viewTd, fValueOf, null, null, null, null, 30);
                        }
                        if (C07DY.LIZ()) {
                            C0PE2 c0pe2LIZ = C645110PSb.LIZ(lifecycleOwner);
                            if (c0pe2LIZ != null) {
                                CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = C646070PVt.LIZ;
                                c646080PVuLIZJ = C646070PVt.LIZJ(c0pe2LIZ.hashCode(), new WeakReference(c0pe2LIZ));
                            }
                            searchContextAbilityImpl = new SearchContextAbilityImpl(9, viewTd, lifecycleOwner, new C646120PVy(viewTd.hashCode(), lifecycleOwner.hashCode()), c646080PVuLIZJ, Integer.valueOf(lifecycleOwner.hashCode()), null);
                        } else {
                            searchContextAbilityImpl = new SearchContextAbilityImpl(121, viewTd, lifecycleOwner, null, null, null, null);
                        }
                        return new SearchCardViewHolder(viewTd, lifecycleOwner, c0szt2, iSearchCardProtocol2, function03, searchContextAbilityImpl);
                    }

                    {
                        this.LIZIZ = i3;
                        this.LIZJ = function0;
                        this.LIZLLL = fragment;
                        this.LJ = c0szt;
                        this.LJFF = iSearchCardProtocol;
                        this.LJI = function02;
                    }
                });
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
