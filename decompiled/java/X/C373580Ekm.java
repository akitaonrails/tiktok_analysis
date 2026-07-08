package X;

import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ekm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373580Ekm extends i<InterfaceC375020En6, C373410EkV, C373330EkN, C373400EkU> implements InterfaceC379610EuV, InterfaceC375020En6 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LLJILJILJ;
    public final C0E48 LLJILLL;
    public final InterfaceC1731706qJ LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373580Ekm.class, "nleApi", "getNleApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/crop/common/api/NLECropApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = 8;
    }

    public final InterfaceC374920Emw F4() {
        return (InterfaceC374920Emw) this.LLJJ.getValue(this, LLJJI[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373330EkN> o2() {
        return AFwS191S0000000_5.get$arr$(196);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373400EkU> w2() {
        return new AwS549S0100000_5(this, 715);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC375020En6
    public void Y3(long j) {
        i3(new AwS24S0000100_5(j, 3));
    }

    @Override // X.InterfaceC375020En6
    public void b5(EnumC373600Eko enumC373600Eko) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LIZ);
        EnumC373450EkZ enumC373450EkZ = EnumC373450EkZ.PLAY_PAUSE;
        C373430EkX c373430EkX = (C373430EkX) linkedHashMap.get(enumC373450EkZ);
        if (c373430EkX != null) {
            if (enumC373600Eko == EnumC373600Eko.PLAY) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            linkedHashMap.put(enumC373450EkZ, C373430EkX.LIZ(c373430EkX, 0, false, 0.0f, Integer.valueOf(i), 0.0f, 23));
        }
        i3(new AwS371S0200000_5((Map) linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) enumC373600Eko, (EnumC373600Eko) 130));
    }

    @Override // X.InterfaceC375020En6
    public void y2(long j) {
        i3(new AwS24S0000100_5(j, 4));
    }

    public C373580Ekm(C19A3 c19a3, C1DRG c1drg, C0E48 c0e48) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c0e48;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374920Emw.class, null);
    }
}
