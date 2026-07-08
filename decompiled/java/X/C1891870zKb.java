package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0zKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891870zKb implements InterfaceC730350Skr {
    public final C01GW LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(515));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(638));
    public Function1<? super Boolean, Unit> LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.InterfaceC730350Skr
    public final AbstractC1906720ziY LIZJ() {
        return (AbstractC1906720ziY) this.LIZIZ.getValue();
    }

    public final C1891910zKf LJ() {
        return (C1891910zKf) this.LIZJ.getValue();
    }

    public final C1891900zKe LJFF() {
        return (C1891900zKe) this.LIZ.getValue();
    }

    public C1891870zKb(C1895007bY c1895007bY) {
        this.LIZ = C452501pT.LIZIZ(new AwS550S0100000_6(c1895007bY, 1306));
    }

    @Override // X.InterfaceC730350Skr
    public final void LIZ(long j) {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1891890zKd(this, j, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    @Override // X.InterfaceC730350Skr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            r10 = this;
            r0 = 0
            r10.LJ = r0
            r10.LJFF = r0
            X.0zKe r0 = r10.LJFF()
            r0.LIZIZ(r11)
            X.0zKe r0 = r10.LJFF()
            r2 = 0
            r0.LJ = r2
            X.01GW r0 = r10.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0ziY r0 = (X.AbstractC1906720ziY) r0
            X.15jK<X.0zJl> r0 = r0.LLILZLL
            r7 = 0
            r0.LJFF(r7)
            X.0zKf r0 = r10.LJ()
            X.15jK<X.0zJl> r0 = r0.LLILZLL
            r0.LJFF(r7)
            r0 = 3
            r10.LIZ(r0)
            X.01GW r0 = r10.LIZIZ
            java.lang.Object r8 = r0.getValue()
            X.0ziY r8 = (X.AbstractC1906720ziY) r8
            X.0zKe r9 = r10.LJFF()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LIZIZ
            if (r0 == 0) goto L5e
            java.util.List r0 = r0.getInteractStickerStructs()
            if (r0 == 0) goto La4
            java.util.Iterator r4 = r0.iterator()
        L4a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0
            int r1 = r0.getType()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L4a
        L5e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.0Giw r5 = new X.0Giw
            com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct r0 = r9.LIZJ
            if (r0 == 0) goto L6f
            java.lang.String r4 = r0.getEmojiContent()
            if (r4 != 0) goto L71
        L6f:
            java.lang.String r4 = "😍"
        L71:
            com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct r0 = r9.LIZJ
            if (r0 == 0) goto La1
            java.lang.Long r0 = r0.getVoteAverage()
            if (r0 == 0) goto La1
            long r0 = r0.longValue()
        L7f:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct r0 = r9.LIZJ
            if (r0 == 0) goto L91
            java.lang.Long r0 = r0.getAnswerCount()
            if (r0 == 0) goto L91
            long r2 = r0.longValue()
        L91:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.<init>(r4, r1, r0)
            r6.add(r5)
        L9b:
            X.15jK<X.0zJl> r0 = r8.LLILZLL
            r0.LIZLLL(r6, r7)
            return
        La1:
            r0 = 0
            goto L7f
        La4:
            X.13BV r6 = X.C13BV.INSTANCE
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891870zKb.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC730350Skr
    public final void LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Context context, Aweme aweme, Function1<? super Boolean, Unit> function1) {
        viewOnAttachStateChangeListenerC20604515jv.LIZJ(LJ());
        C1891910zKf c1891910zKfLJ = LJ();
        ((TextView) c1891910zKfLJ.LLJILJIL.getValue()).setText(context.getString(2131833864));
        ((TextView) c1891910zKfLJ.LLJILJILJ.getValue()).setText(context.getString(2131833867));
        c1891910zKfLJ.LJJI(false);
        c1891910zKfLJ.LJJ(false);
        C1891860zKa c1891860zKa = new C1891860zKa(this);
        C786410Ut5.I7(new ACListenerS137S0100000_2(c1891860zKa, 76), (View) c1891910zKfLJ.LLJIJIL.getValue());
        this.LIZLLL = function1;
        LJFF().LIZIZ(aweme);
    }
}
