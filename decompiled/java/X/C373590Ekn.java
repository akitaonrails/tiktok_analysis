package X;

import Y.AObserverS209S0100000_5;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS24S0000100_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS64S0100100_5;

/* JADX INFO: renamed from: X.0Ekn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373590Ekn extends C0ETZ<C0E5D, C373410EkV, C373330EkN, C373400EkU> implements C0E5D {
    public static final int LLJJIJIIJIL = 8;
    public final C1DRG LLJJI;
    public final C373610Ekp LLJJIII;
    public final AObserverS209S0100000_5 LLJJIJI;

    @Override // X.AbstractC1664470tPp
    public Function0<C373330EkN> o2() {
        return AFwS191S0000000_5.get$arr$(430);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C373400EkU> w2() {
        return new AwS549S0100000_5(this, 1689);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0E55 player;
        super.onCreate();
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, this.LLJJIJI);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJ(this.LLJJIII);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0E55 player;
        super.onDestroy();
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(this.LLJJIJI);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJIII(this.LLJJIII);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        b5(EnumC373600Eko.PAUSE);
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.C0E5D
    public void Y3(long j) {
        i3(new AwS24S0000100_5(j, 11));
    }

    @Override // X.C0E5D
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
        i3(new AwS371S0200000_5((Map) linkedHashMap, (Map<EnumC373450EkZ, C373430EkX>) enumC373600Eko, (EnumC373600Eko) 305));
    }

    @Override // X.C0E5D
    public void y2(long j) {
        i3(new AwS24S0000100_5(j, 12));
        if (j > 0) {
            i3(AFwS234S0000000_5.get$arr$(593));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ekp] */
    public C373590Ekn(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = new INLEListenerVideoOutput() { // from class: X.0Ekp
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                if (i != 0) {
                    return;
                }
                C354270Duj.LIZJ(0L, new AwS64S0100100_5(this.LL, j, 2));
            }
        };
        this.LLJJIJI = new AObserverS209S0100000_5(this, 186);
    }
}
