package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emoji.common.systembigemoji.EmojiModel$onDownloadResourcesComplete$1", f = "EmojiModel.kt", l = {144}, m = "invokeSuspend")
public final class C449590Hk5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Resources LLILLJJLI;
    public final /* synthetic */ List<Emoji> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C449590Hk5(Resources resources, List<? extends Emoji> list, InterfaceC1364105Vn<? super C449590Hk5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = resources;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C449590Hk5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmojiModel@e3ff.onDownloadResourcesComplete$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Map<String, String> map = C449580Hk4.LL;
            ((ConcurrentHashMap) C449580Hk4.LL).clear();
            ((ConcurrentHashMap) C449580Hk4.LLILLJJLI).clear();
            C449610Hk7 c449610Hk7 = C449580Hk4.LLILLL;
            if (c449610Hk7.LIZ != null) {
                Iterator it2 = new LinkedHashMap(c449610Hk7.LIZ).values().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    for (Emoji emoji : (List) it2.next()) {
                        String strLIZ = C454580Hs8.LIZ(emoji);
                        if ((strLIZ == null && (strLIZ = emoji.getDisplayName()) == null) || strLIZ.length() == 0) {
                            strLIZ = emoji.getDisplayName();
                        }
                        Locale locale = Locale.ROOT;
                        String upperCase = strLIZ.toUpperCase(locale);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C449580Hk4.LL;
                        String str = (String) concurrentHashMap.get(upperCase);
                        if (TextUtils.isEmpty(str)) {
                            concurrentHashMap.put(upperCase, String.valueOf(i2));
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(',');
                            sbLIZ.append(i2);
                            concurrentHashMap.put(upperCase, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        String upperCase2 = emoji.getDisplayName().toUpperCase(locale);
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C449580Hk4.LLILLJJLI;
                        String str2 = (String) concurrentHashMap2.get(upperCase2);
                        if (TextUtils.isEmpty(str2)) {
                            concurrentHashMap2.put(upperCase2, String.valueOf(i2));
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append(',');
                            sbLIZ2.append(i2);
                            concurrentHashMap2.put(upperCase2, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        i2++;
                    }
                }
            }
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C449600Hk6 c449600Hk6 = new C449600Hk6(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c449600Hk6) == objLJFF) {
                C1C7U.LIZIZ("EmojiModel@e3ff.onDownloadResourcesComplete$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiModel@e3ff.onDownloadResourcesComplete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
