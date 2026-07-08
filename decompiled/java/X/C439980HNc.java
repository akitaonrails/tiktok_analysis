package X;

import android.content.Context;
import android.graphics.Canvas;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ElementsRepository;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439980HNc {
    public final Context LIZ;
    public final Fragment LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final EnumC441640HTm LIZLLL;
    public final Function0<Boolean> LJ;

    public static AbstractC435540H6a LIZLLL(C439980HNc c439980HNc, InterfaceC440230HOb interfaceC440230HOb) {
        C435590H6f c435590H6f = new C435590H6f(true);
        if (interfaceC440230HOb instanceof C0HKU) {
            return new C441030HRd(c439980HNc.LIZ, c439980HNc.LIZJ, ((C0HKU) interfaceC440230HOb).getState(), c435590H6f);
        }
        if (interfaceC440230HOb instanceof C1372805Yw) {
            return new C441030HRd(c439980HNc.LIZ, c439980HNc.LIZJ, ((C1372805Yw) interfaceC440230HOb).getState(), c435590H6f);
        }
        if (interfaceC440230HOb instanceof C1373105Yz) {
            return new C441030HRd(c439980HNc.LIZ, c439980HNc.LIZJ, ((C1373105Yz) interfaceC440230HOb).getState(), c435590H6f);
        }
        if (interfaceC440230HOb instanceof C1372905Yx) {
            return new C441030HRd(c439980HNc.LIZ, c439980HNc.LIZJ, ((C1372905Yx) interfaceC440230HOb).LIZIZ, c435590H6f);
        }
        if (interfaceC440230HOb instanceof C1372205Yq) {
            return new AbstractC435540H6a() { // from class: X.0H6u
                @Override // X.C0H6M
                public final void LJII(Canvas canvas) {
                }
            };
        }
        if (Intrinsics.LJFF(interfaceC440230HOb, C05Z8.LIZ)) {
            return new AbstractC435540H6a() { // from class: X.0H6u
                @Override // X.C0H6M
                public final void LJII(Canvas canvas) {
                }
            };
        }
        if (interfaceC440230HOb instanceof C0HOD) {
            return new C441030HRd(c439980HNc.LIZ, c439980HNc.LIZJ, ((C0HOD) interfaceC440230HOb).LIZ, c435590H6f);
        }
        throw new C1954807lC();
    }

    public final C0H6M LIZ(InterfaceC440090HNn interfaceC440090HNn, C435590H6f c435590H6f) {
        if (interfaceC440090HNn instanceof C435610H6h) {
            C435610H6h c435610H6h = (C435610H6h) interfaceC440090HNn;
            return new C435570H6d(this.LIZ, c435610H6h.LIZ, true, null, false, c435590H6f, c435610H6h.LIZIZ, 16);
        }
        if (interfaceC440090HNn instanceof C440070HNl) {
            C440070HNl c440070HNl = (C440070HNl) interfaceC440090HNn;
            return new C435620H6i(this.LIZ, this.LIZJ, c440070HNl.LIZIZ, c440070HNl.LIZLLL, c435590H6f);
        }
        if (interfaceC440090HNn instanceof C0HGK) {
            return new C0HGG(this.LIZ, this.LIZIZ.getChildFragmentManager(), this.LIZLLL, this.LJ, ((C0HGK) interfaceC440090HNn).LIZ, null, null, 0, c435590H6f);
        }
        if (interfaceC440090HNn instanceof C440100HNo) {
            return new C435620H6i(this.LIZ, this.LIZJ, ((C440100HNo) interfaceC440090HNn).LIZJ, null, c435590H6f);
        }
        if (interfaceC440090HNn instanceof C435750H6v) {
            C435750H6v c435750H6v = (C435750H6v) interfaceC440090HNn;
            return new C0H6L(this.LIZ, this.LIZJ, c435750H6v.LIZ, c435750H6v.LIZIZ, c435750H6v.LIZJ, null, false, c435750H6v.LIZLLL);
        }
        if (interfaceC440090HNn instanceof C440660HPs) {
            final Context context = this.LIZ;
            final InterfaceC497601wk interfaceC497601wk = this.LIZJ;
            final String str = ((C440660HPs) interfaceC440090HNn).LIZIZ;
            return new C0H6T(context, interfaceC497601wk, str) { // from class: X.0H7G
                public final C0HGY LJIILJJIL = C0HGY.STICKER;
                public final C0H7H LJIILL = C0H7H.PREFILL;

                @Override // X.C0H6M
                public final /* bridge */ /* synthetic */ String LIZIZ() {
                    return null;
                }

                @Override // X.C0H6M
                public final /* bridge */ /* synthetic */ Integer LIZJ() {
                    return null;
                }

                @Override // X.C0H6M
                public final C0H7H LIZLLL() {
                    return this.LJIILL;
                }

                @Override // X.C0H6M
                public final C0HGY LJ() {
                    return this.LJIILJJIL;
                }

                @Override // X.C0H6M
                public final Object LJIIJ(InterfaceC1364105Vn<? super Pair> interfaceC1364105Vn) {
                    return new Pair(null, null);
                }
            };
        }
        throw new C1954807lC();
    }

    public final C0H6M LIZIZ(InterfaceC440050HNj interfaceC440050HNj, final Integer num) {
        if (interfaceC440050HNj instanceof C440010HNf) {
            C440010HNf c440010HNf = (C440010HNf) interfaceC440050HNj;
            return new C435570H6d(this.LIZ, c440010HNf.LIZ, false, num, false, null, c440010HNf.LIZIZ, 48);
        }
        if (interfaceC440050HNj instanceof C440030HNh) {
            C440030HNh c440030HNh = (C440030HNh) interfaceC440050HNj;
            return new C0H6P(this.LIZ, this.LIZJ, c440030HNh.LIZ, c440030HNh.LIZIZ);
        }
        if (interfaceC440050HNj instanceof C439970HNb) {
            final Context context = this.LIZ;
            final FragmentManager childFragmentManager = this.LIZIZ.getChildFragmentManager();
            final EnumC441640HTm enumC441640HTm = this.LIZLLL;
            final Function0<Boolean> function0 = this.LJ;
            C439970HNb c439970HNb = (C439970HNb) interfaceC440050HNj;
            final C0H7H c0h7h = c439970HNb.LIZ;
            final String str = c439970HNb.LIZIZ;
            final int i = c439970HNb.LIZJ;
            return new AbstractC435550H6b(context, childFragmentManager, enumC441640HTm, function0, c0h7h, str, i, num) { // from class: X.0HGI
                public final FragmentManager LJIILIIL;
                public final EnumC441640HTm LJIILJJIL;
                public final Function0<Boolean> LJIILL;
                public final C0H7H LJIILLIIL;
                public final String LJIIZILJ;
                public final int LJIJ;
                public final Integer LJIJI;
                public final C0HGY LJIJJ = C0HGY.TEXT;
                public final C0H7H LJIJJLI = C0H7H.TEXT_PROMPT;
                public final int LJIL;

                @Override // X.C0H6M
                public final /* bridge */ /* synthetic */ String LIZIZ() {
                    return null;
                }

                @Override // X.C0H6M
                public final Integer LIZJ() {
                    return this.LJIJI;
                }

                @Override // X.C0H6M
                public final C0H7H LIZLLL() {
                    return this.LJIJJLI;
                }

                @Override // X.C0H6M
                public final C0HGY LJ() {
                    return this.LJIJJ;
                }

                @Override // X.AbstractC435550H6b
                public final int LJIIJJI() {
                    return this.LJIL;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
                @Override // X.C0H6M
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0HOC, ? extends X.EnumC440340HOm>> r13) {
                    /*
                        r12 = this;
                        boolean r0 = r13 instanceof X.C0HGJ
                        if (r0 == 0) goto L7d
                        r10 = r13
                        X.0HGJ r10 = (X.C0HGJ) r10
                        int r2 = r10.LLILLL
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L7d
                        int r2 = r2 - r1
                        r10.LLILLL = r2
                    L12:
                        java.lang.Object r3 = r10.LL
                        java.lang.Object r2 = X.C099R.LJFF()
                        int r0 = r10.LLILLL
                        r1 = 1
                        if (r0 == 0) goto L58
                        if (r0 != r1) goto L89
                        X.C155000ia.LIZIZ(r3)
                    L22:
                        X.0HZe r3 = (X.C443120HZe) r3
                        r6 = 0
                        if (r3 == 0) goto L83
                        java.lang.Object r1 = r3.getFirst()
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r5 = r3.getSecond()
                        X.0H7H r5 = (X.C0H7H) r5
                        java.lang.Object r0 = r3.getThird()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r4 = r0.booleanValue()
                        X.0HOC r3 = new X.0HOC
                        X.0HGK r2 = new X.0HGK
                        r2.<init>(r1)
                        if (r5 != 0) goto L48
                        X.0H7H r5 = X.C0H7H.TEXT_PROMPT
                    L48:
                        java.lang.Integer r1 = r12.LJIJI
                        r0 = 0
                        r3.<init>(r2, r5, r1, r0)
                        if (r4 == 0) goto L52
                        X.0HOm r6 = X.EnumC440340HOm.TEXT_INPUT
                    L52:
                        kotlin.Pair r0 = new kotlin.Pair
                        r0.<init>(r3, r6)
                        return r0
                    L58:
                        X.C155000ia.LIZIZ(r3)
                        androidx.fragment.app.FragmentManager r3 = r12.LJIILIIL
                        X.0HTm r4 = r12.LJIILJJIL
                        kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r12.LJIILL
                        java.lang.Object r0 = r0.invoke()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r5 = r0.booleanValue()
                        r6 = 0
                        X.0H7H r7 = r12.LJIILLIIL
                        java.lang.String r8 = r12.LJIIZILJ
                        int r9 = r12.LJIJ
                        r11 = 8
                        r10.LLILLL = r1
                        java.lang.Object r3 = X.C0HI6.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        if (r3 != r2) goto L22
                        return r2
                    L7d:
                        X.0HGJ r10 = new X.0HGJ
                        r10.<init>(r12, r13)
                        goto L12
                    L83:
                        kotlin.Pair r0 = new kotlin.Pair
                        r0.<init>(r6, r6)
                        return r0
                    L89:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0HGI.LJIIJ(X.05Vn):java.lang.Object");
                }

                {
                    int i2;
                    this.LJIILIIL = childFragmentManager;
                    this.LJIILJJIL = enumC441640HTm;
                    this.LJIILL = function0;
                    this.LJIILLIIL = c0h7h;
                    this.LJIIZILJ = str;
                    this.LJIJ = i;
                    this.LJIJI = num;
                    if (C440480HPa.LIZJ()) {
                        i2 = R.raw.icon_pen_fill;
                    } else {
                        i2 = R.raw.icon_pen_star_fill;
                    }
                    this.LJIL = i2;
                }
            };
        }
        if (interfaceC440050HNj instanceof C440110HNp) {
            final Context context2 = this.LIZ;
            final FragmentManager childFragmentManager2 = this.LIZIZ.getChildFragmentManager();
            final int i2 = ((C440110HNp) interfaceC440050HNj).LIZ;
            return new AbstractC435550H6b(context2, childFragmentManager2, num, i2) { // from class: X.0H6n
                public final Context LJIILIIL;
                public final FragmentManager LJIILJJIL;
                public final Integer LJIILL;
                public final int LJIILLIIL;
                public final int LJIIZILJ;
                public final C0HGY LJIJ;
                public final C0H7H LJIJI;
                public final boolean LJIJJ;

                @Override // X.C0H6M
                public final /* bridge */ /* synthetic */ String LIZIZ() {
                    return null;
                }

                @Override // X.C0H6M
                public final boolean LIZ() {
                    return this.LJIJJ;
                }

                @Override // X.C0H6M
                public final Integer LIZJ() {
                    return this.LJIILL;
                }

                @Override // X.C0H6M
                public final C0H7H LIZLLL() {
                    return this.LJIJI;
                }

                @Override // X.C0H6M
                public final C0HGY LJ() {
                    return this.LJIJ;
                }

                @Override // X.AbstractC435550H6b
                public final int LJIIJJI() {
                    return this.LJIIZILJ;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Iterable, java.util.List] */
                /* JADX WARN: Type inference failed for: r12v4 */
                /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r9v9, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
                @Override // X.C0H6M
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0HOC, ? extends X.EnumC440340HOm>> r23) {
                    /*
                        Method dump skipped, instruction units count: 590
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C435670H6n.LJIIJ(X.05Vn):java.lang.Object");
                }

                {
                    super(context2);
                    this.LJIILIIL = context2;
                    this.LJIILJJIL = childFragmentManager2;
                    this.LJIILL = num;
                    this.LJIILLIIL = i2;
                    this.LJIIZILJ = R.raw.icon_emoji_fill;
                    this.LJIJ = C0HGY.EMOJI;
                    this.LJIJI = C0H7H.EMOJI_ALL;
                    this.LJIJJ = !C440480HPa.LIZJ();
                }
            };
        }
        if (interfaceC440050HNj instanceof C439990HNd) {
            C439990HNd c439990HNd = (C439990HNd) interfaceC440050HNj;
            return new C0HGG(this.LIZ, this.LIZIZ.getChildFragmentManager(), this.LIZLLL, this.LJ, c439990HNd.LIZ, c439990HNd.LIZIZ, num, c439990HNd.LIZJ, new C435590H6f(true));
        }
        if (interfaceC440050HNj instanceof C440040HNi) {
            final Context context3 = this.LIZ;
            C440040HNi c440040HNi = (C440040HNi) interfaceC440050HNj;
            final int i3 = c440040HNi.LIZ;
            final int i4 = c440040HNi.LIZIZ;
            return new AbstractC435550H6b(i3, i4, context3, num) { // from class: X.0H6R
                public final Integer LJIILIIL;
                public final int LJIILJJIL;
                public final int LJIILL;
                public final int LJIILLIIL;
                public final C0HGY LJIIZILJ;
                public final C0H7H LJIJ;
                public final C01GW LJIJI;
                public final C01GW LJIJJ;

                @Override // X.C0H6M
                public final /* bridge */ /* synthetic */ String LIZIZ() {
                    return null;
                }

                @Override // X.C0H6M
                public final Integer LIZJ() {
                    return this.LJIILIIL;
                }

                @Override // X.C0H6M
                public final C0H7H LIZLLL() {
                    return this.LJIJ;
                }

                @Override // X.C0H6M
                public final C0HGY LJ() {
                    return this.LJIIZILJ;
                }

                @Override // X.AbstractC435550H6b
                public final int LJIIJJI() {
                    return this.LJIILLIIL;
                }

                @Override // X.C0H6M
                public final Object LJIIJ(InterfaceC1364105Vn<? super Pair<C0HOC, ? extends EnumC440340HOm>> interfaceC1364105Vn) {
                    List<Emoji> listLIZIZ;
                    InterfaceC440090HNn c435610H6h;
                    C0HGL c0hglLIZJ;
                    if (C0H6Q.LIZ()) {
                        ElementsRepository elementsRepository = (ElementsRepository) this.LJIJJ.getValue();
                        if (elementsRepository != null && (c0hglLIZJ = elementsRepository.LIZJ(this.LJIILJJIL)) != null) {
                            List<InterfaceC440090HNn> listLIZ = c0hglLIZJ.LIZ(new C0H6S(C2286608xc.LJ(this.LJIILL), 2));
                            if ((!((ArrayList) listLIZ).isEmpty()) && listLIZ != null) {
                                c435610H6h = (InterfaceC440090HNn) ListProtector.get(listLIZ, AbstractC19994813Le.Default.nextInt(listLIZ.size()));
                            }
                        }
                        return new Pair(null, null);
                    }
                    EmojiRepository emojiRepository = (EmojiRepository) this.LJIJI.getValue();
                    if (emojiRepository != null && (listLIZIZ = emojiRepository.LIZIZ(Integer.MAX_VALUE)) != null && (!listLIZIZ.isEmpty())) {
                        c435610H6h = new C435610H6h((Emoji) ListProtector.get(listLIZIZ, AbstractC19994813Le.Default.nextInt(listLIZIZ.size())), this.LJIILJJIL);
                    } else {
                        return new Pair(null, null);
                    }
                    return new Pair(new C0HOC(c435610H6h, C0H7H.RANDOMIZER, this.LJIILIIL, true), null);
                }

                {
                    C0HGY c0hgy;
                    super(context3);
                    this.LJIILIIL = num;
                    this.LJIILJJIL = i3;
                    this.LJIILL = i4;
                    this.LJIILLIIL = R.raw.icon_dices_fill;
                    if (i4 != 3) {
                        if (i4 != 4) {
                            c0hgy = null;
                        } else {
                            c0hgy = C0HGY.MEME;
                        }
                    } else {
                        c0hgy = C0HGY.EMOJI;
                    }
                    this.LJIIZILJ = c0hgy;
                    this.LJIJ = C0H7H.RANDOMIZER;
                    this.LJIJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(432));
                    this.LJIJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(443));
                }
            };
        }
        if (interfaceC440050HNj instanceof C440020HNg) {
            C19EG activity = this.LIZIZ.getActivity();
            if (activity != null) {
                return new AbstractC435550H6b(this.LIZ, activity, this.LIZLLL, num, ((C440020HNg) interfaceC440050HNj).LIZ) { // from class: X.0HGN
                    public final C19EG LJIILIIL;
                    public final EnumC441640HTm LJIILJJIL;
                    public final Integer LJIILL;
                    public final boolean LJIILLIIL;
                    public final int LJIIZILJ = R.raw.icon_image_alt_1_fill;
                    public final C0HGY LJIJ = C0HGY.IMAGE;
                    public final C0H7H LJIJI = C0H7H.ALBUM;
                    public final boolean LJIJJ = !C440480HPa.LIZJ();

                    @Override // X.C0H6M
                    public final /* bridge */ /* synthetic */ String LIZIZ() {
                        return null;
                    }

                    @Override // X.C0H6M
                    public final boolean LIZ() {
                        return this.LJIJJ;
                    }

                    @Override // X.C0H6M
                    public final Integer LIZJ() {
                        return this.LJIILL;
                    }

                    @Override // X.C0H6M
                    public final C0H7H LIZLLL() {
                        return this.LJIJI;
                    }

                    @Override // X.C0H6M
                    public final C0HGY LJ() {
                        return this.LJIJ;
                    }

                    @Override // X.AbstractC435550H6b
                    public final int LJIIJJI() {
                        return this.LJIIZILJ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
                    @Override // X.C0H6M
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0HOC, ? extends X.EnumC440340HOm>> r16) {
                        /*
                            r15 = this;
                            r3 = r16
                            boolean r0 = r3 instanceof X.C0HGM
                            if (r0 == 0) goto L23
                            r6 = r3
                            X.0HGM r6 = (X.C0HGM) r6
                            int r2 = r6.LLILLL
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r2 & r1
                            if (r0 == 0) goto L23
                            int r2 = r2 - r1
                            r6.LLILLL = r2
                        L14:
                            java.lang.Object r1 = r6.LL
                            java.lang.Object r5 = X.C099R.LJFF()
                            int r0 = r6.LLILLL
                            r4 = 1
                            r12 = 0
                            if (r0 == 0) goto L31
                            if (r0 != r4) goto L29
                            goto L5a
                        L23:
                            X.0HGM r6 = new X.0HGM
                            r6.<init>(r15, r3)
                            goto L14
                        L29:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r0)
                            throw r1
                        L31:
                            X.C155000ia.LIZIZ(r1)
                            java.lang.Class<com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAlbumLauncher> r7 = com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAlbumLauncher.class
                            r8 = 0
                            r11 = 14
                            r9 = r8
                            r10 = r8
                            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
                            com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAlbumLauncher r3 = (com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAlbumLauncher) r3
                            if (r3 == 0) goto L64
                            X.19EG r2 = r15.LJIILIIL     // Catch: java.lang.RuntimeException -> L60
                            X.0HTm r0 = r15.LJIILJJIL     // Catch: java.lang.RuntimeException -> L60
                            X.0HTn r0 = X.C441660HTo.LIZIZ(r0)     // Catch: java.lang.RuntimeException -> L60
                            java.lang.String r1 = r0.getParam()     // Catch: java.lang.RuntimeException -> L60
                            boolean r0 = r15.LJIILLIIL     // Catch: java.lang.RuntimeException -> L60
                            r6.LLILLL = r4     // Catch: java.lang.RuntimeException -> L60
                            java.lang.Object r1 = r3.LIZ(r2, r1, r0, r6)     // Catch: java.lang.RuntimeException -> L60
                            if (r1 != r5) goto L5d
                            return r5
                        L5a:
                            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.RuntimeException -> L60
                        L5d:
                            kotlin.Pair r1 = (kotlin.Pair) r1     // Catch: java.lang.RuntimeException -> L60
                            goto L65
                        L60:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L64:
                            r1 = r12
                        L65:
                            if (r1 == 0) goto L8b
                            java.lang.Object r10 = r1.getFirst()
                            java.lang.String r10 = (java.lang.String) r10
                            java.lang.Object r11 = r1.getSecond()
                            java.lang.String r11 = (java.lang.String) r11
                            X.0HOC r3 = new X.0HOC
                            X.0HNl r9 = new X.0HNl
                            r14 = 8
                            r13 = r12
                            r9.<init>(r10, r11, r12, r13, r14)
                            X.0H7H r2 = X.C0H7H.ALBUM
                            java.lang.Integer r1 = r15.LJIILL
                            r0 = 0
                            r3.<init>(r9, r2, r1, r0)
                        L85:
                            kotlin.Pair r0 = new kotlin.Pair
                            r0.<init>(r3, r12)
                            return r0
                        L8b:
                            r3 = r12
                            goto L85
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0HGN.LJIIJ(X.05Vn):java.lang.Object");
                    }

                    {
                        this.LJIILIIL = activity;
                        this.LJIILJJIL = enumC441640HTm;
                        this.LJIILL = num;
                        this.LJIILLIIL = z;
                    }
                };
            }
            return null;
        }
        if (interfaceC440050HNj instanceof C440060HNk) {
            return new C435620H6i(this.LIZ, this.LIZJ, ((C440060HNk) interfaceC440050HNj).LIZIZ, null, new C435590H6f(true));
        }
        if (interfaceC440050HNj instanceof C440000HNe) {
            C440000HNe c440000HNe = (C440000HNe) interfaceC440050HNj;
            return new C0H6L(this.LIZ, this.LIZJ, c440000HNe.LIZ, c440000HNe.LIZIZ, c440000HNe.LIZJ, num, false, c440000HNe.LIZLLL);
        }
        if (interfaceC440050HNj instanceof C440080HNm) {
            return new C435630H6j(this.LIZ, this.LIZJ, this.LIZIZ.getChildFragmentManager(), num, ((C440080HNm) interfaceC440050HNj).LIZ);
        }
        throw new C1954807lC();
    }

    public C439980HNc(Context context, Fragment fragment, LifecycleCoroutineScope lifecycleCoroutineScope, EnumC441640HTm enumC441640HTm, Function0 function0) {
        this.LIZ = context;
        this.LIZIZ = fragment;
        this.LIZJ = lifecycleCoroutineScope;
        this.LIZLLL = enumC441640HTm;
        this.LJ = function0;
    }
}
