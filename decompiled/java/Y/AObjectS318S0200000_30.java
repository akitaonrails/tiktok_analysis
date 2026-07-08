package Y;

import X.C11JF;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C13GJ;
import X.C13HG;
import X.C1701940uOG;
import X.C20185513yX;
import X.EnumC1335310kqv;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AObjectS318S0200000_30 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS318S0200000_30 aObjectS318S0200000_30, Object obj) {
        C13HG c13hg = (C13HG) aObjectS318S0200000_30.l0;
        C13HG c13hg2 = (C13HG) aObjectS318S0200000_30.l1;
        C13GJ c13gj = (C13GJ) obj;
        C13GJ.LIZ(c13gj, "key", c13hg.getDescriptor());
        C13GJ.LIZ(c13gj, "value", c13hg2.getDescriptor());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS318S0200000_30 aObjectS318S0200000_30, Object obj) {
        C13HG c13hg = (C13HG) aObjectS318S0200000_30.l0;
        C13HG c13hg2 = (C13HG) aObjectS318S0200000_30.l1;
        C13GJ c13gj = (C13GJ) obj;
        C13GJ.LIZ(c13gj, "first", c13hg.getDescriptor());
        C13GJ.LIZ(c13gj, "second", c13hg2.getDescriptor());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS318S0200000_30 aObjectS318S0200000_30, Object obj) {
        EnumC1335310kqv enumC1335310kqv;
        ((DiskManagerSettingsVM) aObjectS318S0200000_30.l0).setState(AFwS274S0000000_30.get$arr$(71));
        DiskManagerSettingsVM diskManagerSettingsVM = (DiskManagerSettingsVM) aObjectS318S0200000_30.l0;
        C20185513yX c20185513yX = diskManagerSettingsVM.LL;
        if (c20185513yX != null) {
            enumC1335310kqv = c20185513yX.LIZLLL;
        } else {
            enumC1335310kqv = null;
        }
        C11O8 c11o8LJJJLZIJ = C11NZ.LJJJJZ("").LJL(C11S5.LIZ()).LJJJJZI(new AkS331S0200000_30((DiskManagerSettingsVM) aObjectS318S0200000_30.l0, enumC1335310kqv, 0)).LJJJLZIJ(C1701940uOG.LIZIZ());
        DiskManagerSettingsVM diskManagerSettingsVM2 = (DiskManagerSettingsVM) aObjectS318S0200000_30.l0;
        Context context = (Context) aObjectS318S0200000_30.l1;
        diskManagerSettingsVM.LLILZLL = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS160S0200000_26(context, diskManagerSettingsVM2, 1), new AfS160S0200000_26(context, diskManagerSettingsVM2, 2));
        ((DiskManagerSettingsVM) aObjectS318S0200000_30.l0).LLILZ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS318S0200000_30 aObjectS318S0200000_30, Object obj) {
        EnumC1335310kqv enumC1335310kqv;
        ((DiskManagerSettingsVM) aObjectS318S0200000_30.l0).setState(AFwS274S0000000_30.get$arr$(72));
        DiskManagerSettingsVM diskManagerSettingsVM = (DiskManagerSettingsVM) aObjectS318S0200000_30.l0;
        C20185513yX c20185513yX = diskManagerSettingsVM.LL;
        if (c20185513yX != null) {
            enumC1335310kqv = c20185513yX.LIZLLL;
        } else {
            enumC1335310kqv = null;
        }
        C11O8 c11o8LJJJLZIJ = C11NZ.LJJJJZ("").LJL(C11S5.LIZ()).LJJJJZI(new AkS331S0200000_30((DiskManagerSettingsVM) aObjectS318S0200000_30.l0, enumC1335310kqv, 1)).LJJJLZIJ(C1701940uOG.LIZIZ());
        DiskManagerSettingsVM diskManagerSettingsVM2 = (DiskManagerSettingsVM) aObjectS318S0200000_30.l0;
        Context context = (Context) aObjectS318S0200000_30.l1;
        diskManagerSettingsVM.LLIZ = (C11JF) c11o8LJJJLZIJ.LJJLL(new AfS160S0200000_26(context, diskManagerSettingsVM2, 3), new AfS160S0200000_26(context, diskManagerSettingsVM2, 4));
        ((DiskManagerSettingsVM) aObjectS318S0200000_30.l0).LLILZIL = true;
        return Unit.LIZ;
    }

    public AObjectS318S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
