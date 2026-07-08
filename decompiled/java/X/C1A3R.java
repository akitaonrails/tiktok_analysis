package X;

import android.content.Context;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS277S0300000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1A3R, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3R extends C09AY implements Function1<C09HH, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1A3S LLILLJJLI;
    public final /* synthetic */ Function2<C1A3T, C09HH, Unit> LLILLL;
    public final /* synthetic */ HistoryRecordPageVM LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A3R(boolean z, C1A3S c1a3s, Function2 function2, HistoryRecordPageVM historyRecordPageVM, Context context, AwS434S0200000_33 awS434S0200000_33) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c1a3s;
        this.LLILLL = function2;
        this.LLILZ = historyRecordPageVM;
        this.LLILZIL = context;
        this.LLILZLL = awS434S0200000_33;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C09HH c09hh) {
        C09HH c09hh2 = c09hh;
        if (this.LL) {
            C1A3S c1a3s = this.LLILLJJLI;
            c1a3s.LJIILIIL = c1a3s.LJIILIIL.plus(c09hh2);
        } else {
            this.LLILLJJLI.LJIILIIL = c09hh2;
        }
        if (c09hh2.getTotalCount() == 0) {
            C675940QfI.LIZ(new AwS612S0100000_33(this.LLILLJJLI, 59));
            this.LLILLJJLI.LJIIJ.LIZLLL = Long.valueOf(System.currentTimeMillis());
            h0<C1A3T> h0Var = this.LLILLJJLI.LJIIJJI;
            C1A3T c1a3t = C1A3T.NO_RECORD;
            h0Var.LJII(c1a3t);
            Function2<C1A3T, C09HH, Unit> function2 = this.LLILLL;
            if (function2 != null) {
                function2.invoke(c1a3t, c09hh2);
            }
        } else {
            HistoryRecordPageVM historyRecordPageVM = this.LLILZ;
            Context context = this.LLILZIL;
            AwS277S0300000_33 awS277S0300000_33 = new AwS277S0300000_33(this.LLILLJJLI, (C1A3S) this.LLILLL, (Function2<? super C1A3T, ? super C09HH, Unit>) c09hh2, (C09HH) 3);
            Function0<Unit> function0 = this.LLILZLL;
            historyRecordPageVM.getClass();
            Object obj = new Object();
            C118300cf c118300cf = new C118300cf();
            C013C c013c = new C013C();
            C118300cf c118300cf2 = new C118300cf();
            Iterator<C09HF> it2 = c09hh2.getDailyModels().iterator();
            while (it2.hasNext()) {
                c118300cf2.element += it2.next().getHistoryRecords().size();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<C09HF> it3 = c09hh2.getDailyModels().iterator();
            while (it3.hasNext()) {
                Iterator<C09HE> it4 = it3.next().getHistoryRecords().iterator();
                while (it4.hasNext()) {
                    String imageUrl = it4.next().getImageUrl();
                    C118300cf c118300cf3 = c118300cf2;
                    final C316701Kr c316701Kr = new C316701Kr(obj, c118300cf, c118300cf2, historyRecordPageVM, jCurrentTimeMillis, awS277S0300000_33);
                    final C316601Kq c316601Kq = new C316601Kq(c013c, obj, historyRecordPageVM, function0);
                    int screenWidth = (int) (ScreenUtils.getScreenWidth(context) / 4.0f);
                    C09JS.LIZ.getClass();
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C09JS.LIZ(imageUrl)));
                    c1325700kbQLIZLLL.LJIIZILJ = new C1320270kSf() { // from class: X.1A3Y
                        @Override // X.C1320270kSf, X.InterfaceC1325670kbN
                        public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
                            c316701Kr.invoke();
                        }

                        @Override // X.C1320270kSf, X.InterfaceC1325670kbN
                        public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
                            c316601Kq.invoke();
                            C675940QfI.LIZ(AFwS279S0000000_33.get$arr$(436));
                        }
                    };
                    c1325700kbQLIZLLL.LIZJ = new C1324630kZh(screenWidth, screenWidth);
                    C1322200kVm.LIZ().LJIIZILJ(c1325700kbQLIZLLL.LIZ(), null);
                    c118300cf2 = c118300cf3;
                }
            }
        }
        return Unit.LIZ;
    }
}
