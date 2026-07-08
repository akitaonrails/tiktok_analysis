package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503780JpI extends C09AY implements Function2<UIAssem, C291001Au<? extends SpacePost>, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503780JpI(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(2);
        this.LL = subSpaceFeedAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0083 A[EDGE_INSN: B:60:0x0083->B:38:0x0083 BREAK  A[LOOP:1: B:33:0x0074->B:57:0x00b3], SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.bytedance.assem.arch.core.UIAssem r10, X.C291001Au<? extends com.bytedance.android.livesdk.chatroom.api.SpacePost> r11) {
        /*
            r9 = this;
            X.01Au r11 = (X.C291001Au) r11
            if (r11 == 0) goto Lb0
            T r2 = r11.LIZ
            com.bytedance.android.livesdk.chatroom.api.SpacePost r2 = (com.bytedance.android.livesdk.chatroom.api.SpacePost) r2
            if (r2 == 0) goto Lb0
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem r4 = r9.LL
            r0 = 2131844327(0x7f115ce7, float:1.9322044E38)
            X.C766270U4b.LIZLLL(r0)
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM r0 = r4.kp()
            X.0JpG r6 = r0.LLILZIL
            r3 = 0
            if (r6 == 0) goto La9
            int r1 = r2.postType
            X.0JoB r0 = X.EnumC503090JoB.TEXT
            int r0 = r0.getValue()
            if (r1 != r0) goto L59
            java.util.ArrayList r5 = X.C503760JpG.LIZIZ(r2)
        L29:
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM r0 = r6.LL
            boolean r0 = r0.xQ2()
            if (r0 == 0) goto L3a
            X.0Jn4 r1 = new X.0Jn4
            r0 = 0
            r1.<init>(r0)
            r5.add(r1)
        L3a:
            X.0JoS r0 = r6.LLILLL
            r8 = -1
            if (r0 == 0) goto L66
            java.util.ArrayList<X.0JpL> r0 = r0.LL
            if (r0 == 0) goto L66
            java.util.Iterator r1 = r0.iterator()
            r7 = 0
        L48:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C504640Jqg
            if (r0 != 0) goto L67
            int r7 = r7 + 1
            goto L48
        L59:
            X.0JoB r0 = X.EnumC503090JoB.POLL
            int r0 = r0.getValue()
            if (r1 != r0) goto La9
            java.util.ArrayList r5 = X.C503760JpG.LIZ(r2)
            goto L29
        L66:
            r7 = -1
        L67:
            X.0JoS r0 = r6.LLILLL
            if (r0 == 0) goto L83
            java.util.ArrayList<X.0JpL> r0 = r0.LL
            if (r0 == 0) goto L83
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r2.next()
            boolean r0 = r0 instanceof X.C503420Joi
            if (r0 == 0) goto Lb3
            r8 = r1
        L83:
            if (r7 >= 0) goto L86
            r7 = r8
        L86:
            if (r7 > 0) goto L89
            r7 = 0
        L89:
            int r0 = r5.size()
            if (r0 <= 0) goto La9
            X.0JoS r0 = r6.LLILLL
            if (r0 == 0) goto L9c
            java.util.ArrayList<X.0JpL> r1 = r0.LL
            if (r1 == 0) goto L9c
            int r0 = r7 + 1
            r1.addAll(r0, r5)
        L9c:
            X.0JoS r2 = r6.LLILLL
            if (r2 == 0) goto La9
            int r1 = r7 + 1
            int r0 = r5.size()
            r2.notifyItemRangeInserted(r1, r0)
        La9:
            androidx.recyclerview.widget.RecyclerView r0 = r4.LLJJIJI
            if (r0 == 0) goto Lb0
            r0.smoothScrollToPosition(r3)
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb3:
            int r1 = r1 + 1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C503780JpI.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
