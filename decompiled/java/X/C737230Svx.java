package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResult;
import com.ss.android.ugc.aweme.social.sticker.model.SecretReplyResultEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Svx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service.SecretRepliesManager$fetchSecretRepliesViewerListPaginated$2$1", f = "SecretRepliesManager.kt", l = {}, m = "invokeSuspend")
public final class C737230Svx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SecretReplyResult LL;
    public final /* synthetic */ C737240Svy LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C737230Svx(SecretReplyResult secretReplyResult, C737240Svy c737240Svy, String str, Function1<? super Boolean, Unit> function1, Aweme aweme, InterfaceC1364105Vn<? super C737230Svx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = secretReplyResult;
        this.LLILLJJLI = c737240Svy;
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737230Svx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecretRepliesManager@ff73.fetchSecretRepliesViewerListPaginated$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.LJFF().LIZIZ.setValue(Integer.valueOf(this.LL.totalCount));
        C737280Sw2 c737280Sw2LJFF = this.LLILLJJLI.LJFF();
        Integer numLJ = C2286608xc.LJ(this.LL.nextCursor);
        if (numLJ != null) {
            c737280Sw2LJFF.LIZJ.setValue(numLJ);
        } else {
            c737280Sw2LJFF.getClass();
        }
        C737280Sw2 c737280Sw2LJFF2 = this.LLILLJJLI.LJFF();
        c737280Sw2LJFF2.LIZ.setValue(this.LLILLL);
        List<SecretReplyResultEntry> list = this.LL.secretReplyResultEntries;
        Aweme aweme = this.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SecretReplyResultEntry> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C730370Skt(aweme, it2.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Function1<? super List<C730370Skt>, Unit> function1 = this.LLILLJJLI.LIZIZ;
        if (function1 != null) {
            function1.invoke(arrayList2);
        }
        Function1<Boolean, Unit> function12 = this.LLILZ;
        if (function12 != null) {
            function12.invoke(Boolean.valueOf(this.LL.hasMore));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecretRepliesManager@ff73.fetchSecretRepliesViewerListPaginated$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
