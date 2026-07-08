package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C650950Pg5 implements C0QW5<C650950Pg5>, Serializable, C0PWT {
    public static final C646000PVm Companion = new C646000PVm();
    public static final boolean isEnabledP3;
    public final C650960Pg6 LL;
    public final C0PSJ LLILLJJLI;
    public final String LLILLL;

    public C650950Pg5() {
        this(new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)), new C0PSJ(new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null), new C0PS4(-1, 0, "", new LinkedHashMap(), "", "", "")));
    }

    public static final void attachSource(LifecycleOwner lifecycleOwner, C650950Pg5 c650950Pg5) {
        Companion.getClass();
        C646000PVm.LIZ(lifecycleOwner, c650950Pg5);
    }

    @InterfaceC1294060jmO
    public static final C0PRW fetchCurrentFragmentData() {
        Companion.getClass();
        return C646000PVm.LIZIZ();
    }

    @InterfaceC1294060jmO
    public static final C650960Pg6 fetchImmutableData() {
        Companion.getClass();
        return C646000PVm.LIZJ();
    }

    public static final C0PRW fetchOwnFragmentData(View view) {
        Companion.getClass();
        return C646000PVm.LIZLLL(view);
    }

    public static final C0PRW fetchOwnFragmentData(Fragment fragment) {
        Companion.getClass();
        return C646000PVm.LJ(fragment);
    }

    public static final C0PS4 fetchOwnGlobalData(Fragment fragment, LifecycleOwner lifecycleOwner) {
        Companion.getClass();
        return C646000PVm.LJFF(fragment, lifecycleOwner);
    }

    public static final C650960Pg6 fetchOwnImmutableData(InterfaceC665370Q7z interfaceC665370Q7z) {
        Companion.getClass();
        return C646000PVm.LJIIIIZZ(interfaceC665370Q7z);
    }

    public static final C650960Pg6 fetchOwnImmutableData(View view) {
        Companion.getClass();
        return C646000PVm.LJI(view);
    }

    public static final C650960Pg6 fetchOwnImmutableData(Fragment fragment, LifecycleOwner lifecycleOwner) {
        Companion.getClass();
        return C646000PVm.LJII(fragment, lifecycleOwner);
    }

    public static final C650950Pg5 fetchOwnSource(Fragment fragment, LifecycleOwner lifecycleOwner) {
        Companion.getClass();
        return C646000PVm.LJIIIZ(fragment, lifecycleOwner);
    }

    public static final C0PRW fetchTopFragmentData(Fragment fragment, C19EG c19eg) {
        Companion.getClass();
        return C646000PVm.LJIIJJI(fragment, c19eg);
    }

    public static final void updateContextSource(Fragment fragment, LifecycleOwner lifecycleOwner, Function1<? super C650950Pg5, C650950Pg5> function1) {
        Companion.getClass();
        C646000PVm.LJIILJJIL(fragment, lifecycleOwner, function1);
    }

    public final C650950Pg5 copy(C650960Pg6 c650960Pg6, C0PSJ c0psj) {
        return new C650950Pg5(c650960Pg6, c0psj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C650950Pg5)) {
            return false;
        }
        C650950Pg5 c650950Pg5 = (C650950Pg5) obj;
        return Intrinsics.LJFF(this.LL, c650950Pg5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c650950Pg5.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public void prepare() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchContextSource(immutableData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mutableData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        SAFHelper.LIZ.getClass();
        isEnabledP3 = SAFHelper.LJIIJJI();
    }

    @Override // X.C0PWT
    public boolean isLog() {
        return C0P9U.LIZ();
    }

    public final C650960Pg6 getImmutableData() {
        return this.LL;
    }

    public final C0PSJ getMutableData() {
        return this.LLILLJJLI;
    }

    public String getSourceId() {
        return this.LLILLL;
    }

    public static final C0PS4 fetchOwnGlobalData(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650950Pg5 c650950Pg5;
        C0PSJ mutableData;
        Companion.getClass();
        if (view == null || (interfaceC665370Q7zLJIIL = C646000PVm.LJIIL(view)) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIIL, "source_default_key", C650950Pg5.class, null)) == null || (c650950Pg5 = (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource()) == null || (mutableData = c650950Pg5.getMutableData()) == null) {
            return null;
        }
        return mutableData.globalData;
    }

    public static final C650950Pg5 fetchOwnSource(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Companion.getClass();
        if (view == null || (interfaceC665370Q7zLJIIL = C646000PVm.LJIIL(view)) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIIL, "source_default_key", C650950Pg5.class, null)) == null) {
            return null;
        }
        return (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource();
    }

    public static final C0PS4 fetchOwnGlobalData(InterfaceC665370Q7z interfaceC665370Q7z) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650950Pg5 c650950Pg5;
        C0PSJ mutableData;
        Companion.getClass();
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C650950Pg5.class, null)) == null || (c650950Pg5 = (C650950Pg5) interfaceC1555100qZQLIZIZ.getSource()) == null || (mutableData = c650950Pg5.getMutableData()) == null) {
            return null;
        }
        return mutableData.globalData;
    }

    public C650950Pg5(C650960Pg6 c650960Pg6, C0PSJ c0psj) {
        this.LL = c650960Pg6;
        this.LLILLJJLI = c0psj;
        this.LLILLL = UUID.randomUUID().toString();
    }
}
