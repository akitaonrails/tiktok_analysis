package X;

import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965690bEl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C965670bEj LL;
    public final /* synthetic */ C965340bEC LLILLJJLI;
    public final /* synthetic */ C965710bEn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965690bEl(C965670bEj c965670bEj, C965340bEC c965340bEC, C965710bEn c965710bEn) {
        super(0);
        this.LL = c965670bEj;
        this.LLILLJJLI = c965340bEC;
        this.LLILLL = c965710bEn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CopyOnWriteArrayList<InterfaceC954180awC> copyOnWriteArrayList = this.LL.LJFF;
        C965710bEn c965710bEn = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC954180awC interfaceC954180awC : copyOnWriteArrayList) {
            InterfaceC954180awC interfaceC954180awC2 = interfaceC954180awC;
            if ((interfaceC954180awC2 instanceof C965340bEC) && ((C965340bEC) interfaceC954180awC2).LIZIZ == c965710bEn.LIZIZ) {
                arrayList.add(interfaceC954180awC);
            }
        }
        this.LL.LJFF.removeAll(C13LP.LLIIJI(arrayList));
        this.LL.LJFF.add(this.LLILLJJLI);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C965340bEC) ((InterfaceC954180awC) it2.next())).LJLJI("dispose_on_linker_destroy", EnumC965730bEp.UNKNOWN);
        }
        CopyOnWriteArrayList<InterfaceC968210bIp> copyOnWriteArrayList2 = this.LL.LJI;
        C965340bEC c965340bEC = this.LLILLJJLI;
        Iterator<InterfaceC968210bIp> it3 = copyOnWriteArrayList2.iterator();
        while (it3.hasNext()) {
            it3.next().LLLLIIL(c965340bEC);
        }
        LinkLayerMessage linkLayerMessage = this.LLILLL.LIZLLL;
        if (linkLayerMessage != null) {
            this.LLILLJJLI.LLJL(linkLayerMessage);
        }
        return Unit.LIZ;
    }
}
