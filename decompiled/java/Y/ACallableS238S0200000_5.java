package Y;

import X.C0CHQ;
import X.C0EGS;
import X.C0EK4;
import X.C0FI2;
import X.C0FIC;
import X.C0FT3;
import X.C0FT4;
import X.C0FTJ;
import X.C0FX8;
import X.C0FXB;
import X.C15O7;
import X.C19292410dm;
import X.C196909122h;
import X.C1C7U;
import X.C390390FSj;
import X.EnumC1254700iku;
import X.InterfaceC1635390sev;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class ACallableS238S0200000_5 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS238S0200000_5 aCallableS238S0200000_5) {
        C1C7U.LIZ("StickerManager@19f6.compilerAllStickers$1");
        C0FT4 c0ft4 = (C0FT4) ((C390390FSj) aCallableS238S0200000_5.l0).LJIIJJI.getValue();
        List<C0FTJ<StickerModel>> list = ((C390390FSj) aCallableS238S0200000_5.l0).LJIIL;
        c0ft4.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<C0FTJ> arrayList2 = (ArrayList) list;
        for (C0FTJ c0ftj : arrayList2) {
            arrayList.add(C15O7.LIZIZ(new ACallableS413S0100000_5(c0ftj.LIZIZ(), 2), C15O7.LJIIIIZZ, null).LJIIZILJ(new C0FXB(c0ft4, c0ftj.LJJIIJZLJL(), 0), C15O7.LJI));
        }
        try {
            C15O7.LJJ(arrayList).LJIJJLI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0FT3) ((C15O7) ListProtector.get(arrayList, i)).LJIIL()).LIZIZ) {
                linkedHashMap.put(Integer.valueOf(((C0FTJ) ListProtector.get(arrayList2, i)).getStickerId()), ((C0FT3) ((C15O7) ListProtector.get(arrayList, i)).LJIIL()).LIZ);
            } else {
                linkedHashMap.put(Integer.valueOf(((C0FTJ) ListProtector.get(arrayList2, i)).getStickerId()), "");
            }
        }
        ((Function1) aCallableS238S0200000_5.l1).invoke(linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerManager@19f6.compilerAllStickers$1");
        return unit;
    }

    public static final Object call$1(ACallableS238S0200000_5 aCallableS238S0200000_5) {
        boolean z;
        C0FI2 c0fi2 = (C0FI2) aCallableS238S0200000_5.l0;
        IFetchEffectChannelListener iFetchEffectChannelListener = (IFetchEffectChannelListener) aCallableS238S0200000_5.l1;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.fetch$1L");
        InterfaceC1635390sev interfaceC1635390sevLIZ = C196909122h.LIZ();
        String str = c0fi2.LIZ;
        if (C0FIC.LIZ() == 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1635390sevLIZ.LJI(str, z, iFetchEffectChannelListener);
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.fetch$1L");
        return null;
    }

    public static final Object call$2(ACallableS238S0200000_5 aCallableS238S0200000_5) {
        C0FI2 c0fi2 = (C0FI2) aCallableS238S0200000_5.l0;
        TextFontStyleData textFontStyleData = (TextFontStyleData) aCallableS238S0200000_5.l1;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadTextFontForFirstItem$1L");
        C196909122h.LIZ().LJIIL(textFontStyleData.LJ, new C0FX8(textFontStyleData, 2));
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadTextFontForFirstItem$1L");
        return null;
    }

    public static final Object call$3(ACallableS238S0200000_5 aCallableS238S0200000_5) {
        C19292410dm c19292410dmLJI;
        C1C7U.LIZ("EPInitLegacyBizController@227b.updateEditorEffectInfoTitle$2");
        C0EK4 c0ek4 = (C0EK4) aCallableS238S0200000_5.l0;
        C0EGS c0egs = (C0EGS) aCallableS238S0200000_5.l1;
        String str = c0egs.LIZ;
        String str2 = c0egs.LIZIZ;
        c0ek4.getClass();
        try {
            c19292410dmLJI = C0CHQ.LIZ().getAccountService().LJI(str, str2, EnumC1254700iku.STICKER_EDIT);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c19292410dmLJI = null;
        }
        C1C7U.LIZIZ("EPInitLegacyBizController@227b.updateEditorEffectInfoTitle$2");
        return c19292410dmLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS238S0200000_5(Object obj, C390390FSj c390390FSj, Function1<? super Map<Integer, String>, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = c390390FSj;
    }
}
