package X;

import Y.ARunnableS98S0200000_29;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1298, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class AnonymousClass1298 extends RecyclerView.ViewHolder {
    public final C129C LL;
    public final AnonymousClass1297 LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public boolean LLILZIL;
    public final C1295960jpS LLILZLL;
    public final FrameLayout LLIZ;
    public final C426090GnH LLIZLLLIL;
    public MusicModel LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final View LLJILJILJ;
    public final C129A LLJILLL;
    public final C19470511Fn LLJJ;
    public final TextView LLJJI;
    public final TextView LLJJIII;
    public final TextView LLJJIJI;
    public final TextView LLJJIJIIJIL;
    public final TuxIconView LLJJIJIL;
    public final TuxIconView LLJJJ;
    public final TuxTextView LLJJJIL;
    public final TextView LLJJJJ;
    public final View LLJJJJJIL;
    public final TuxIconView LLJJJJLIIL;
    public final C197039127h LLJJL;
    public final IMusicService LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;

    public float P5() {
        return 76.0f;
    }

    public final boolean L5() {
        C426090GnH c426090GnH = this.LLIZLLLIL;
        return (c426090GnH == null || c426090GnH.getVisibility() != 0 || this.LLJI) ? false : true;
    }

    public final boolean W5() {
        C426090GnH c426090GnH;
        Object tag = this.itemView.getTag(R.id.x1u);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(tag, bool) || (c426090GnH = this.LLIZLLLIL) == null) {
            return false;
        }
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        C786410Ut5.LLFII(0, c426090GnH);
        C1295960jpS c1295960jpS = this.LLILZLL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        if (c426090GnH.isAttachedToWindow() && c426090GnH.isLaidOut()) {
            c426090GnH.LIZJ();
        } else {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c426090GnH, new ARunnableS98S0200000_29(c426090GnH, c426090GnH, 63));
        }
        C0EZ7.LIZJ("music_panel");
        this.itemView.setTag(R.id.x1u, bool);
        return true;
    }

    public final int N5() {
        Integer numLIZJ = C12DO.LIZ() ? C1308910kAL.LIZJ(R.attr.a1c, this.itemView.getContext()) : C1308910kAL.LIZJ(R.attr.dz, this.itemView.getContext());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public final void U5() {
        Integer numLIZJ;
        if (!C12DO.LIZ() || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, this.itemView.getContext())) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        C1295960jpS c1295960jpS = this.LLILZLL;
        if (c1295960jpS != null) {
            c1295960jpS.addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (C1295400joY<ColorFilter>) new C1295400joY(new C1296110jph(iIntValue)));
        }
    }

    public static final void T5(C19470511Fn c19470511Fn) {
        c19470511Fn.LIZIZ(new BitmapDrawable(c19470511Fn.getResources(), C417560GYw.LIZ(BitmapFactory.decodeResource(c19470511Fn.getResources(), R.drawable.bzi), C418440Gaw.LIZIZ(4))));
        c19470511Fn.getImageView().setBackground(c19470511Fn.LLJLL);
    }

    public final boolean R5(MusicModel musicModel) {
        List<MusicTag> musicTags;
        String tagTitle;
        MusicTag musicTag;
        if (!this.LLILZ || (musicTags = musicModel.getMusicTags()) == null || musicTags.isEmpty()) {
            return false;
        }
        List<MusicTag> musicTags2 = musicModel.getMusicTags();
        if (musicTags2 != null && (musicTag = (MusicTag) C13LP.LJJJLL(musicTags2)) != null) {
            tagTitle = musicTag.getTagTitle();
        } else {
            tagTitle = null;
        }
        if (!C123100dR.LIZ(tagTitle)) {
            return false;
        }
        return true;
    }

    public final void S5(boolean z) {
        if (this.LLJIJIL == z) {
            return;
        }
        this.LLJIJIL = z;
        X5(this.LLJ, this.LLILZIL, this.LLJI);
    }

    public final void V5(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        X5(this.LLJ, this.LLILZIL, this.LLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[PHI: r9
      0x0069: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean) binds: [B:47:0x0066, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            android.widget.FrameLayout r8 = r10.LLIZ
            if (r8 != 0) goto L5
            return
        L5:
            X.0GnH r7 = r10.LLIZLLLIL
            X.0jpS r6 = r10.LLILZLL
            r5 = 0
            X.C786410Ut5.LJZ(r5, r8)
            r4 = 1
            if (r11 == 0) goto L65
            boolean r0 = r11.hasLyricsCopyRight()
            if (r0 != r4) goto L65
            r9 = 1
        L17:
            boolean r0 = r11.isLocalMusic()
            if (r0 != r4) goto L69
            r3 = 1
        L1e:
            X.129C r0 = r10.LL
            boolean r2 = r0.LIZLLL
            if (r12 == 0) goto L63
            if (r13 == 0) goto L63
            r1 = 1
        L27:
            boolean r0 = r10.LLJIJIL
            if (r0 != 0) goto L2f
            boolean r0 = r10.LLJILJIL
            if (r0 == 0) goto L61
        L2f:
            if (r9 == 0) goto L61
            if (r1 != 0) goto L61
            if (r3 != 0) goto L61
            if (r2 == 0) goto L61
        L37:
            r0 = 8
            if (r4 == 0) goto L46
            if (r7 == 0) goto L40
            X.C786410Ut5.LLFII(r5, r7)
        L40:
            if (r6 == 0) goto L45
            X.C786410Ut5.LLD(r0, r6)
        L45:
            return
        L46:
            if (r1 == 0) goto L53
            if (r7 == 0) goto L4d
            X.C786410Ut5.LLFII(r0, r7)
        L4d:
            if (r6 == 0) goto L45
            X.C786410Ut5.LLD(r5, r6)
            return
        L53:
            X.C786410Ut5.LJZ(r0, r8)
            if (r7 == 0) goto L5b
            X.C786410Ut5.LLFII(r0, r7)
        L5b:
            if (r6 == 0) goto L45
            X.C786410Ut5.LLD(r0, r6)
            return
        L61:
            r4 = 0
            goto L37
        L63:
            r1 = 0
            goto L27
        L65:
            r9 = 0
            if (r11 == 0) goto L69
            goto L17
        L69:
            r3 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1298.X5(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.1299] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass1298(X.C129C r21, android.view.View r22, X.AnonymousClass1297 r23, boolean r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1298.<init>(X.129C, android.view.View, X.1297, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0140 -> B:601:0x0146). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I5(int r16, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 2452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1298.I5(int, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean, boolean, boolean, boolean):void");
    }
}
