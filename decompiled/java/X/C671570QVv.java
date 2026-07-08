package X;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671570QVv extends C0QW9 {
    public final C671890QXb LLJJIJIL;
    public final C0QW4 LLJJJ;
    public final Map<String, String> LLJJJIL;
    public final Map<String, String> LLJJJJ;
    public final Map<String, String> LLJJJJJIL;
    public final Map<C0QUT, Function1<C0QWD, Unit>> LLJJJJLIIL;
    public final Map<C0QUT, Function0<Boolean>> LLJJL;

    @Override // X.C0QW9
    public final Map<C0QUT, Function0<Boolean>> LIZ() {
        return this.LLJJL;
    }

    @Override // X.C0QW9
    public final Map<C0QUT, Function1<C0QWD, Unit>> LIZIZ() {
        return this.LLJJJJLIIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C671570QVv(Context context, C671890QXb c671890QXb, C0QVV c0qvv, AwS546S0100000_2 awS546S0100000_2, AwS554S0100000_10 awS554S0100000_10, AwS546S0100000_2 awS546S0100000_22, AwS546S0100000_2 awS546S0100000_23) {
        C0QUT c0qut = C0QUT.RESULT;
        super(c0qvv, awS546S0100000_2, awS554S0100000_10, awS546S0100000_22, awS546S0100000_23, C1697810uHb.LJIILJJIL(c0qut));
        this.LLJJIJIL = c671890QXb;
        Word word = new Word();
        String str = c671890QXb.LJFF;
        word.setWord((str == null || !Boolean.valueOf(C123100dR.LIZ(str)).booleanValue()) ? "" : str);
        this.LLJJJ = new C0QW4(word, 2, 0);
        this.LLJJJIL = new LinkedHashMap();
        this.LLJJJJ = new LinkedHashMap();
        this.LLJJJJJIL = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(c0qut, new AwS376S0200000_10(context, this, 108));
        this.LLJJJJLIIL = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(c0qut, AFwS196S0000000_10.get$arr$(580));
        this.LLJJL = linkedHashMap2;
    }
}
