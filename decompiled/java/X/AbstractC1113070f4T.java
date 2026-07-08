package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenLogIntervalSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSeiAlignOptSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.0f4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1113070f4T extends AbstractC1096380edY {
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public int LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public long LJJLIIIJLLLLLLLZ;
    public long LJJLIL;
    public long LJJLJ;
    public final PublicScreenService LJJLJLI;
    public final BPEAHandler LIZIZ = new BPEAHandler(new C1151670g4j(this, 8));
    public final C1113210f4h LIZJ = new C1113210f4h();
    public final C1113240f4k LIZLLL = new C1113240f4k();
    public final long LJJLIIJ = ((long) LivePublicScreenLogIntervalSetting.INSTANCE.getValue()) * 1000;

    public void LJJJJL() {
    }

    public abstract void LJJJJLI(boolean z);

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void onPause() {
        LJJJJJL(false);
        this.LIZIZ.removeCallbacksAndMessages(null);
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public void onUnload() {
        LJJJJJL(false);
        this.LJJLIL = 0L;
        this.LIZIZ.removeCallbacksAndMessages(null);
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void Cr() {
        if (this.LJJLIL > 0) {
            this.LJJLJ += SystemClock.uptimeMillis() - this.LJJLIL;
            this.LJJLIL = 0L;
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJIJJLI() {
        this.LJJLIIIJLLLLLLLZ++;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJJJI() {
        this.LJJIJ++;
    }

    public AbstractC1113070f4T() {
        C006A c006aLIZJ = C1161920gLG.LIZJ(IPublicScreenService.class);
        this.LJJLJLI = c006aLIZJ instanceof PublicScreenService ? (PublicScreenService) c006aLIZJ : null;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIIJ() {
        if (LivePublicScreenMessageSeiAlignOptSetting.enable()) {
            this.LJJL++;
        }
    }

    public final String LJJJJJ() {
        UserAttr userAttr;
        if (LJJJJIZL().LJI) {
            return "anchor";
        }
        User userLIZLLL = LJJJJIZL().LIZLLL();
        return (userLIZLLL == null || (userAttr = userLIZLLL.getUserAttr()) == null || !userAttr.isAdmin) ? "viewer" : "admin";
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public void onResume() {
        boolean zLJI = MethodIDManager.LJI(202134);
        this.LIZIZ.removeCallbacksAndMessages(null);
        C786410Ut5.LJLJJI(1, this.LJJLIIJ, this.LIZIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LIZLLL(int i) {
        if (LivePublicScreenMessageSeiAlignOptSetting.enable()) {
            this.LJJJZ += i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJ(X.InterfaceC1112060f2q r5) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1113070f4T.LJ(X.0f2q):void");
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJIILJJIL(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY instanceof ChatMessage) {
            this.LJ++;
            if (((ChatMessage) abstractC1136060ffY).LIZIZ()) {
                this.LJI++;
                return;
            }
            return;
        }
        if (abstractC1136060ffY instanceof EmoteChatMessage) {
            this.LJFF++;
            return;
        }
        if (abstractC1136060ffY instanceof LikeMessage) {
            this.LJII++;
            return;
        }
        if (abstractC1136060ffY instanceof GiftMessage) {
            this.LJIIIIZZ++;
            return;
        }
        if (abstractC1136060ffY instanceof SocialMessage) {
            if (((int) ((SocialMessage) abstractC1136060ffY).action) == 3) {
                this.LJIIIZ++;
                return;
            } else if (((int) ((SocialMessage) abstractC1136060ffY).action) == 1) {
                this.LJIIJ++;
                return;
            }
        }
        if ((abstractC1136060ffY instanceof MemberMessage) && ((MemberMessage) abstractC1136060ffY).action == 1) {
            this.LJIIJJI++;
        } else {
            if (!(abstractC1136060ffY instanceof CommentReplyMessage)) {
                return;
            }
            this.LJIIL++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIZILJ(X.InterfaceC1112060f2q r6) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1113070f4T.LJIIZILJ(X.0f2q):void");
    }

    public final void LJJJJJL(boolean z) {
        long jLongValue;
        if (this.LJJLIL > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.LJJLJ += jUptimeMillis - this.LJJLIL;
            this.LJJLIL = jUptimeMillis;
        }
        LJJJJLI(z);
        PublicScreenService publicScreenService = this.LJJLJLI;
        if (publicScreenService != null) {
            long j = LJJJJIZL().LJIIZILJ;
            long j2 = this.LJJLJ;
            Long l = publicScreenService.LLILZIL.get(j);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            publicScreenService.LLILZIL.put(j, Long.valueOf(jLongValue + j2));
        }
        this.LJJLJ = 0L;
        this.LJIILL = 0;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJJIIZI = 0;
        this.LJJIJIIJI = 0;
        this.LJJIJIIJIL = 0;
        this.LJJJLL = 0;
        this.LJJJZ = 0;
        this.LJJL = 0;
        this.LJJLI = 0;
        this.LJIJ = 0;
        this.LJIJI = 0;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = 0;
        this.LJJIFFI = 0;
        this.LJJII = 0;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = 0;
        this.LJJIIZ = 0;
        this.LJJIJIL = 0;
        this.LJJIJL = 0;
        this.LJJIL = 0;
        this.LJJIZ = 0;
        this.LJJJ = 0;
        this.LJJJI = 0;
        this.LJJJIL = 0;
        this.LJJJJ = 0;
        this.LJJLIIIJ = 0;
        this.LJJLIIIJILLIZJL = 0;
        this.LJJLIIIJJI = 0;
        this.LJJLIIIJJIZ = 0;
        this.LJJLIIIJL = 0;
        this.LJJLIIIJLJLI = 0;
        this.LJJJJI = 0;
        this.LJJJJIZL = 0;
        this.LJJJJJ = 0;
        this.LJJJJZ = 0;
        this.LJJJJZI = 0;
        this.LJJJJJL = 0;
        this.LJJJJL = 0;
        this.LJJJJLI = 0;
        this.LJJJJLL = 0;
        this.LJJLIIIIJ = 0;
        this.LJJJLIIL = 0;
        this.LJJLIIIJLLLLLLLZ = 0L;
        this.LJJIJ = 0;
        C1113210f4h c1113210f4h = this.LIZJ;
        c1113210f4h.LIZ = 0;
        c1113210f4h.LIZIZ = 0;
        c1113210f4h.LIZJ = 0;
        c1113210f4h.LIZLLL = 0;
        c1113210f4h.LJ = 0;
        c1113210f4h.LJFF = 0;
        c1113210f4h.LJI = 0;
        c1113210f4h.LJII = 0;
        c1113210f4h.LJIIIIZZ = 0;
        c1113210f4h.LJIIIZ = 0;
        c1113210f4h.LJIIJ = 0;
        c1113210f4h.LJIIJJI = 0;
        C1113240f4k c1113240f4k = this.LIZLLL;
        c1113240f4k.LIZ = 0;
        c1113240f4k.LIZIZ = 0;
        c1113240f4k.LIZJ = 0;
        c1113240f4k.LIZLLL = 0;
        c1113240f4k.LJ = 0;
        c1113240f4k.LJFF = 0;
        c1113240f4k.LJI = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJJJLZIJ = 0;
        this.LJJIII = 0;
        LJJJJL();
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJIIIZ(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        if (interfaceC1112060f2q instanceof C180400mg) {
            this.LJJ++;
            return;
        }
        if (interfaceC1112060f2q instanceof C1111000f18) {
            this.LJJI++;
            return;
        }
        if (interfaceC1112060f2q instanceof C239500wD) {
            if (((C239500wD) interfaceC1112060f2q).LLJLILLLLZIIL()) {
                this.LJJIFFI++;
                return;
            } else if (((C239500wD) interfaceC1112060f2q).LLJLIL()) {
                this.LJJII++;
                return;
            }
        }
        if (interfaceC1112060f2q instanceof AbstractC1110520f0M) {
            MESSAGE message = ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
            if ((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) {
                this.LJJIIJ++;
            }
            if ((interfaceC1112060f2q instanceof C1110310f01) && ((ChatMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL).LIZIZ()) {
                this.LJJIIZ++;
            }
            if (!(interfaceC1112060f2q instanceof C1110320f02)) {
                return;
            }
            this.LJJIIJZLJL++;
            return;
        }
        if ((interfaceC1112060f2q instanceof C234500vP) && ((MemberMessage) ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL).action == 1) {
            this.LJJIJL++;
        } else {
            if (!(interfaceC1112060f2q instanceof C1110640f0Y)) {
                return;
            }
            this.LJJIII++;
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public void LJIIJJI(View view, boolean z) {
        if (z) {
            C786410Ut5.LJLJJI(1, this.LJJLIIJ, this.LIZIZ);
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public void LJJIL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        boolean zLLL;
        if (interfaceC1112060f2q.LJJJZ().LIZJ == 1 && (interfaceC1112060f2q instanceof AbstractC1110520f0M)) {
            AbstractC1110520f0M abstractC1110520f0M = (AbstractC1110520f0M) interfaceC1112060f2q;
            if (C1322020kVU.LIZ()) {
                zLLL = ((Boolean) abstractC1110520f0M.LJJIIJ.getValue()).booleanValue();
            } else {
                zLLL = abstractC1110520f0M.LLL();
            }
            if (zLLL) {
                this.LJJIIZI++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIILLIIL(X.AbstractC1136060ffY r7, X.AbstractC1111980f2i r8, boolean r9, com.bytedance.android.live.base.model.user.User r10) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.LikeMessage
            r5 = 1
            if (r0 == 0) goto Lc
            int r0 = r6.LJJ
            int r0 = r0 + 1
            r6.LJJ = r0
        Lb:
            return
        Lc:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.GiftMessage
            if (r0 == 0) goto L17
            int r0 = r6.LJJI
            int r0 = r0 + 1
            r6.LJJI = r0
            return
        L17:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.SocialMessage
            if (r0 == 0) goto L3f
            r0 = r7
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r3 = r0.action
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2d
            int r0 = r6.LJJIFFI
            int r0 = r0 + 1
            r6.LJJIFFI = r0
            return
        L2d:
            r0 = r7
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r3 = r0.action
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3f
            int r0 = r6.LJJII
            int r0 = r0 + 1
            r6.LJJII = r0
            return
        L3f:
            boolean r1 = r7 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r1 != 0) goto L6c
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 != 0) goto L68
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.LiveIntroMessage
            if (r0 != 0) goto L68
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.MemberMessage
            if (r0 == 0) goto L5d
            r0 = r7
            com.bytedance.android.livesdk.model.message.MemberMessage r0 = (com.bytedance.android.livesdk.model.message.MemberMessage) r0
            int r0 = r0.action
            if (r0 != r5) goto L5d
            int r0 = r6.LJJIJL
            int r0 = r0 + 1
            r6.LJJIJL = r0
            return
        L5d:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.CommentReplyMessage
            if (r0 == 0) goto Lb
            int r0 = r6.LJJIII
            int r0 = r0 + 1
            r6.LJJIII = r0
            return
        L68:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto L83
        L6c:
            int r0 = r6.LJJIIJ
            int r0 = r0 + 1
            r6.LJJIIJ = r0
            if (r1 == 0) goto L83
            r0 = r7
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L83
            int r0 = r6.LJJIIZ
            int r0 = r0 + 1
            r6.LJJIIZ = r0
        L83:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto Lb
            int r0 = r6.LJJIIJZLJL
            int r0 = r0 + 1
            r6.LJJIIJZLJL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1113070f4T.LJIILLIIL(X.0ffY, X.0f2i, boolean, com.bytedance.android.live.base.model.user.User):void");
    }
}
