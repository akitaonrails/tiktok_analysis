package X;

import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5P implements InterfaceC460500I4a, InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final Context LL;
    public final C01GW<IAwemeStatusViewModel> LLILLJJLI;
    public final boolean LLILLL;
    public final Function0<Integer> LLILZ;
    public final AbstractC2252651DEx LLILZIL;
    public volatile C1598406Nq LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I5P.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    @Override // X.C0I4V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0I3K<X.C460810I5f> LIZ(X.C869590Y9l r13) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I5P.LIZ(X.0Y9l):X.0I3K");
    }

    public final C460810I5f LIZIZ(C869590Y9l c869590Y9l, BaseContent.ReferenceVideo referenceVideo) {
        int i;
        if (referenceVideo.getRefVideoIsStory()) {
            i = 2131831103;
        } else {
            i = 2131831104;
        }
        C0I4Y<InterfaceC460300I3g> c0i4yLIZJ = C460710I4v.LIZJ(referenceVideo.getRefVideoIsStory(), C460710I4v.LIZ(c869590Y9l), c869590Y9l, this.LL);
        final C1233704sB c1233704sB = new C1233704sB(i, (List<String>) null);
        return new C460810I5f(c0i4yLIZJ, new AbstractC1236404sc(c1233704sB) { // from class: X.04sJ
            public final InterfaceC460300I3g LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1234504sJ) && Intrinsics.LJFF(this.LIZIZ, ((C1234504sJ) obj).LIZIZ);
            }

            public final int hashCode() {
                return this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ServerDeletedText(data=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1236404sc
            public final InterfaceC460300I3g LIZ() {
                return this.LIZIZ;
            }

            {
                super(c1233704sB);
                this.LIZIZ = c1233704sB;
            }
        }, new C0I3R(c869590Y9l.getRefMsgId(), Long.valueOf(1809)), 35);
    }

    public C0I5P(Context context, AssemVMLazy assemVMLazy, boolean z) {
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(801);
        this.LL = context;
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = z;
        this.LLILZ = aFwS187S0000000_2;
        C1598406Nq c1598406Nq = this.LLILZLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLILZLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLILZLL = c1598406Nq;
                }
            }
        }
        this.LLILZIL = c1598406Nq.LIZ;
    }

    public static void LIZJ(C869590Y9l c869590Y9l, String str, String str2, String str3) {
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("ref_video_state"), str) && Intrinsics.LJFF(c869590Y9l.getLocalExt().get("cover_url"), str2) && Intrinsics.LJFF(c869590Y9l.getLocalExt().get("story_expire_at"), str3)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Intrinsics.LJFF(c869590Y9l.getLocalExt().get("ref_video_state"), str)) {
            c869590Y9l.getLocalExt().put("ref_video_state", str);
            linkedHashMap.put("ref_video_state", new C0Y3R(str));
        }
        if (str2 != null && !Intrinsics.LJFF(c869590Y9l.getLocalExt().get("cover_url"), str2)) {
            c869590Y9l.getLocalExt().put("cover_url", str2);
            linkedHashMap.put("cover_url", new C0Y3R(str2));
        }
        if (str3 != null && !Intrinsics.LJFF(c869590Y9l.getLocalExt().get("story_expire_at"), str3)) {
            c869590Y9l.getLocalExt().put("story_expire_at", str3);
            linkedHashMap.put("story_expire_at", new C0Y3R(str3));
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(c869590Y9l, linkedHashMap)), false, new C0Y3I("Update latest flag for ServerDeletedRefVideoLogicHandler"));
    }
}
