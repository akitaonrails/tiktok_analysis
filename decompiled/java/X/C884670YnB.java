package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884670YnB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ List<C879040Ye6> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884670YnB(ChatListEngine chatListEngine, List<C879040Ye6> list) {
        super(0);
        this.LL = chatListEngine;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        new C259800zU();
        ChatListEngine chatListEngine = this.LL;
        Object obj = chatListEngine.LJFF;
        List<C879040Ye6> list = this.LLILLJJLI;
        synchronized (obj) {
            try {
                if (chatListEngine.LJIIIZ().isEmpty()) {
                    ((C823170WQx) chatListEngine.LJIIZILJ.getValue()).addAll(list);
                } else {
                    List listLLIIII = C13LP.LLIIII(chatListEngine.LJIIIZ());
                    ArrayList arrayList = new ArrayList();
                    for (C879040Ye6 c879040Ye6 : list) {
                        C879040Ye6 c879040Ye62 = c879040Ye6;
                        if (c879040Ye62.LIZ() != null && chatListEngine.LJIILLIIL().add(c879040Ye62)) {
                            arrayList.add(c879040Ye6);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        InterfaceC884990Ynh interfaceC884990Ynh = ((C879040Ye6) it2.next()).LIZIZ;
                        if (interfaceC884990Ynh != null) {
                            Iterator it3 = listLLIIII.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                                interfaceC884990Ynh.LIZLLL();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
