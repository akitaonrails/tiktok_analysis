package X;

import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emoji.common.systembigemoji.EmojiModel$onDownloadResourcesComplete$1$1", f = "EmojiModel.kt", l = {}, m = "invokeSuspend")
public final class C449600Hk6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Resources LL;
    public final /* synthetic */ List<Emoji> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C449600Hk6(Resources resources, List<? extends Emoji> list, InterfaceC1364105Vn<? super C449600Hk6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = resources;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C449600Hk6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmojiModel@e3ff.onDownloadResourcesComplete$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator it2 = ((ArrayList) C449580Hk4.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC449620Hk8) it2.next()).LIZ(this.LL, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiModel@e3ff.onDownloadResourcesComplete$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
