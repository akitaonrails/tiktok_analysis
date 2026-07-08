package X;

import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Xwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865050Xwd extends AbstractC867440Y1e<List<String>> {
    public boolean LJ;
    public final C0YEM LJFF;
    public final InterfaceC864790XwD LJI;
    public final C0Y5R LJII;

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && responseBody.batch_delete_conversation_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(List<C443120HZe<String, Long, Integer>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C443120HZe<String, Long, Integer> c443120HZe : list) {
            C0Y2F c0y2f = new C0Y2F();
            c0y2f.LIZLLL = c443120HZe.getFirst();
            c0y2f.LJ = c443120HZe.getSecond();
            c0y2f.LJFF = c443120HZe.getThird();
            arrayList.add(c0y2f.build());
        }
        C867710Y2f c867710Y2f = new C867710Y2f();
        C1516540pZE.LIZ(arrayList);
        c867710Y2f.LIZLLL = arrayList;
        BatchDeleteConversationRequestBody batchDeleteConversationRequestBodyLIZIZ = c867710Y2f.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJIIZ = batchDeleteConversationRequestBodyLIZIZ;
        LJIIIZ(0, c1es0.build(), null, new Object[0]);
    }

    public C865050Xwd(C0YEM c0yem, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        super(c0yem, C0YMR.BATCH_DELETE_CONVERSATIONS.getValue(), interfaceC863600XuI);
        this.LJ = false;
        this.LJFF = c0yem;
        InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
        this.LJI = interfaceC864790XwDLJIIZILJ;
        this.LJII = interfaceC864790XwDLJIIZILJ.LIZIZ();
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            return;
        }
        if (!this.LJ && C0Y81.LJ(c0yin.LLIZ, this.LJFF.LJIIIZ().LJJJJJ)) {
            this.LJ = true;
            final List<DeleteConversationRequestBody> list = c0yin.LLILZLL.body.batch_delete_conversation_body.delete_requests;
            final ArrayList arrayList = new ArrayList();
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            Iterator<DeleteConversationRequestBody> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LJI.LIZLLL().LIZLLL().LJJLIIIJLLLLLLLZ(c0yin.LJI(), new InterfaceC863600XuI<C0Y8T>() { // from class: X.0Xvy
                    @Override // X.InterfaceC863600XuI
                    public final void LIZIZ(C0YMW c0ymw) {
                        if (atomicInteger.addAndGet(1) >= list.size()) {
                            if (!arrayList.isEmpty()) {
                                this.LJ.LJIILIIL(arrayList);
                            } else {
                                this.LJ.LIZ(c0yin);
                            }
                        }
                    }

                    @Override // X.InterfaceC863600XuI
                    public final void onSuccess(C0Y8T c0y8t) {
                        C0Y8T c0y8t2 = c0y8t;
                        arrayList.add(new C443120HZe(c0y8t2.getConversationId(), Long.valueOf(c0y8t2.getConversationShortId()), Integer.valueOf(c0y8t2.getConversationType())));
                        if (atomicInteger.addAndGet(1) >= list.size()) {
                            this.LJ.LJIILIIL(arrayList);
                        }
                    }
                }, it2.next().conversation_id);
            }
            return;
        }
        LIZ(c0yin);
    }

    public final void LJIIJJI(Boolean bool, Boolean bool2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0Y8T c0y8t = (C0Y8T) it2.next();
            arrayList.add(new C443120HZe(c0y8t.getConversationId(), Long.valueOf(c0y8t.getConversationShortId()), Integer.valueOf(c0y8t.getConversationType())));
        }
        LJIIL(bool, bool2, arrayList);
    }

    public final void LJIIL(final Boolean bool, Boolean bool2, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            final ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C443120HZe) it2.next()).getFirst());
            }
            int i = 0;
            this.LJFF.LJIIJJI().LIZJ(new C914040ZtS(this, arrayList2, 16), new InterfaceC864800XwE<Boolean>() { // from class: X.0Xvz
                @Override // X.InterfaceC864800XwE
                public final void LIZ(Boolean bool3) {
                    if (bool3.booleanValue()) {
                        this.LIZJ.LJI.LIZLLL().LIZLLL().LJJLJLI(arrayList2, bool.booleanValue());
                        this.LIZJ.LIZJ(arrayList2);
                    } else {
                        C865050Xwd c865050Xwd = this.LIZJ;
                        c865050Xwd.LIZ(C0YIN.LJFF(c865050Xwd.LJFF, -3001));
                    }
                }
            }, false, this.LJFF.LJIIL().LIZJ());
            if (!bool2.booleanValue()) {
                int size = arrayList.size();
                int i2 = 100;
                while (i < size) {
                    if (i + i2 > size) {
                        i2 = size - i;
                    }
                    int i3 = i + i2;
                    LJIILIIL(arrayList.subList(i, i3));
                    i = i3;
                }
            }
        }
    }
}
