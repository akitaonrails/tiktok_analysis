package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.drawer.BotSharedDrawer$drawBotMessage$1$bitmap$1", f = "BotSharedDrawer.kt", l = {59}, m = "invokeSuspend")
public final class C01RC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ List<Pair<Boolean, Bitmap>> LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RC(List<Pair<Boolean, Bitmap>> list, InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC1364105Vn<? super C01RC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC665370Q7z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotSharedDrawer@74f5.drawBotMessage$1$bitmap$1");
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
            C12FW c12fw = new C12FW(this.LLILLL, this.LLILLJJLI);
            this.LL = 1;
            obj = c12fw.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BotSharedDrawer@74f5.drawBotMessage$1$bitmap$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BotSharedDrawer@74f5.drawBotMessage$1$bitmap$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
