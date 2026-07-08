package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14DL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14DL {
    public final String LIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.STRIP_MUSIC_PREVIEW, "", true).getAbsolutePath();
    public final Map<String, C1403205eQ> LIZIZ = new LinkedHashMap();

    static {
        ((Number) C0AC2.LIZ.getValue()).longValue();
    }

    public static Object LJIIIIZZ(String str, C0WX6 c0wx6) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c0wx6));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1402505eJ(str, new AwS583S0100000_4(c23260099m, 235), new AwS581S0100000_2(c23260099m, 436), null), 3);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c0wx6);
        }
        return objLIZ;
    }

    public static Object LJIIJ(final String str, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        C0CHQ.LIZ().LJJJJL().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0Mdf
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request music failed, id: ");
                sbLIZ.append(str);
                sbLIZ.append(", reason: ");
                sbLIZ.append(exc.getMessage());
                C201955140j.LJIILL(c201962140q, "MusicStripV2", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1364105Vn<AVMusic> interfaceC1364105Vn = c23260099m;
                C098200Yq c098200Yq = new C098200Yq(exc);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(AVMusic aVMusic) {
                if (aVMusic == null) {
                    C201955140j.LJIILL(C201962140q.LIZIZ, "MusicStripV2", "request music null");
                    InterfaceC1364105Vn<AVMusic> interfaceC1364105Vn = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq(new RuntimeException("music is null"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                    return;
                }
                InterfaceC1364105Vn<AVMusic> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(aVMusic);
                interfaceC1364105Vn2.resumeWith(aVMusic);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(android.content.Context r8, final com.ss.android.ugc.aweme.creative.model.music.AVMusic r9, X.AbstractC23140094w r10) {
        /*
            r4 = r8
            X.099m r1 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r10)
            r1.<init>(r0)
            if (r4 != 0) goto L16
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L2e
            android.app.Activity r4 = r0.LIZIZ()
        L16:
            if (r4 == 0) goto L2e
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0sMX r2 = r0.LJJJJL()
            java.lang.String r3 = "replace_download"
            X.0Mde r8 = new X.0Mde
            r5 = r9
            r8.<init>()
            r6 = 0
            r7 = r6
            r9 = r6
            r2.LJ(r3, r4, r5, r6, r7, r8, r9)
        L2e:
            java.lang.Object r1 = r1.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L3b
            X.C099Q.LIZJ(r10)
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.creative.model.music.AVMusic, X.094w):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10, X.InterfaceC1364105Vn<? super X.C0WXA> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C14DR
            if (r0 == 0) goto L6e
            r7 = r11
            X.14DR r7 = (X.C14DR) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r3 = 0
            java.lang.String r4 = "MusicStripV2"
            r2 = 1
            if (r0 == 0) goto L4f
            if (r0 != r2) goto L84
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L27:
            X.05eQ r6 = (X.C1403205eQ) r6
            if (r6 == 0) goto L74
            java.lang.String r3 = r9.getAid()
            X.140q r2 = X.C201962140q.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "download success "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIILL(r2, r4, r0)
            java.util.Map<java.lang.String, X.05eQ> r0 = r8.LIZIZ
            r0.put(r3, r6)
            X.0WXA r0 = new X.0WXA
            r0.<init>(r6)
            return r0
        L4f:
            X.C155000ia.LIZIZ(r6)
            X.140q r1 = X.C201962140q.LIZIZ
            java.lang.String r0 = "start download"
            X.C201955140j.LJIILL(r1, r4, r0)
            java.lang.System.currentTimeMillis()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.05vY r0 = new X.05vY
            r0.<init>(r9, r8, r10, r3)
            r7.LL = r9
            r7.LLILZ = r2
            java.lang.Object r6 = X.C23250099c.LJI(r7, r1, r0)
            if (r6 != r5) goto L27
            return r5
        L6e:
            X.14DR r7 = new X.14DR
            r7.<init>(r8, r11)
            goto L12
        L74:
            r9.getAid()
            X.140q r1 = X.C201962140q.LIZIZ
            java.lang.String r0 = "download failed"
            X.C201955140j.LJIILL(r1, r4, r0)
            X.0WXA r0 = new X.0WXA
            r0.<init>(r3)
            return r0
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.feed.model.Aweme r6, android.content.Context r7, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C14DQ
            if (r0 == 0) goto L4a
            r4 = r8
            X.14DQ r4 = (X.C14DQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L50
            X.C155000ia.LIZIZ(r1)
        L22:
            if (r1 != 0) goto L29
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L29:
            return r1
        L2a:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.music.model.Music r0 = r6.getMusic()
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.music.model.RemainMusicFusion r0 = r0.remainMusicFusion
            if (r0 == 0) goto L24
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r1 = r0.fusedMusicInfos
            if (r1 == 0) goto L24
            r0 = 256(0x100, float:3.59E-43)
            kotlin.jvm.internal.AFwS274S0000000_30 r0 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r0)
            r4.LLILLL = r2
            java.lang.Object r1 = r5.LJFF(r1, r7, r0, r4)
            if (r1 != r3) goto L22
            return r3
        L4a:
            X.14DQ r4 = new X.14DQ
            r4.<init>(r5, r8)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LJII(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    public final Object LIZLLL(UrlModel urlModel, String str, final String str2, InterfaceC1364105Vn<? super C19718712Cz> interfaceC1364105Vn) {
        final List<String> urlList;
        String str3;
        String uri;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        if (urlList != null) {
            str3 = (String) ListProtector.get(urlList, 0);
        } else {
            str3 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (urlModel != null) {
            uri = urlModel.getUri();
        } else {
            uri = null;
        }
        sbLIZ.append(C08HM.LIZJ(uri));
        sbLIZ.append(".wav");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str3 != null && str3.length() != 0 && !TextUtils.equals(str, "from_promote") && !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(strLIZIZ);
            if (C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2))) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LIZ);
                sbLIZ3.append(strLIZIZ);
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ3);
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("audio download");
                sbLIZ4.append((String) c259800zU.element);
                C201955140j.LJIILL(c201962140q, "MusicStripV2", C2188811AlT.LIZIZ(sbLIZ4));
                String str4 = (String) c259800zU.element;
                if (str2 == null) {
                    str2 = "";
                }
                C19718712Cz c19718712Cz = new C19718712Cz(str4, str2);
                C189200o6.m2constructorimpl(c19718712Cz);
                c23260099m.resumeWith(c19718712Cz);
            } else {
                C1383560m6k.LIZ(urlList, this.LIZ, strLIZIZ, new C0T9U(urlList) { // from class: X.12DR
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.AbstractC1383500m6e
                    public final void LJ(String str5, String str6) {
                        super.LJ(str5, str6);
                        c259800zU.element = str6;
                        C201962140q c201962140q2 = C201962140q.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("audio download success");
                        sbLIZ5.append(c259800zU.element);
                        C201955140j.LJIILL(c201962140q2, "VideoDownloader", C2188811AlT.LIZIZ(sbLIZ5));
                        InterfaceC1364105Vn<C19718712Cz> interfaceC1364105Vn2 = c23260099m;
                        String str7 = c259800zU.element;
                        String str8 = str2;
                        if (str8 == null) {
                            str8 = "";
                        }
                        C19718712Cz c19718712Cz2 = new C19718712Cz(str7, str8);
                        C189200o6.m2constructorimpl(c19718712Cz2);
                        interfaceC1364105Vn2.resumeWith(c19718712Cz2);
                    }

                    @Override // X.AbstractC1383500m6e
                    public final void LIZIZ(Exception exc, Integer num, String str5) {
                        super.LIZIZ(exc, num, str5);
                        InterfaceC1364105Vn<C19718712Cz> interfaceC1364105Vn2 = c23260099m;
                        C098200Yq c098200Yq = new C098200Yq(new RuntimeException(str5));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn2.resumeWith(c098200Yq);
                    }
                });
            }
        } else {
            C189200o6.m2constructorimpl(null);
            c23260099m.resumeWith(null);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13, X.C1510705vl r14, X.InterfaceC1364105Vn<? super X.C19718712Cz> r15) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.05vl, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0212 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x018c -> B:16:0x017c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x019c -> B:16:0x017c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01f8 -> B:12:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r129, android.content.Context r130, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> r131, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel>> r132) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LJFF(java.util.List, android.content.Context, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.feed.model.Aweme r6, android.content.Context r7, kotlin.jvm.internal.AFwS229S0000000_2 r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C14DO
            if (r0 == 0) goto L46
            r4 = r9
            X.14DO r4 = (X.C14DO) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L4c
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L29
        L24:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L29:
            return r3
        L2a:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.music.model.Music r0 = r6.getMusic()
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.music.model.MusicFusion r0 = r0.getMusicFusion()
            if (r0 == 0) goto L24
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r0 = r0.fusedMusicInfos
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LJFF(r0, r7, r8, r4)
            if (r3 != r2) goto L22
            return r2
        L46:
            X.14DO r4 = new X.14DO
            r4.<init>(r5, r9)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, kotlin.jvm.internal.AFwS229S0000000_2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[LOOP:1: B:35:0x009e->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(com.ss.android.ugc.aweme.feed.model.Aweme r128, android.content.Context r129, X.C1510705vl r130, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel> r131) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14DL.LJIIIZ(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, X.05vl, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0m6e, X.12DS] */
    public final Object LIZJ(Aweme aweme, final String str, final String str2, final List<String> list, final String str3, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        final String strLIZIZ;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start download video filePath");
        sbLIZ.append(str);
        sbLIZ.append(" fileName");
        sbLIZ.append(str2);
        C201955140j.LJIILL(c201962140q, "MusicStripV2", C2188811AlT.LIZIZ(sbLIZ));
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(str2);
        if (C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            C189200o6.m2constructorimpl(strLIZIZ2);
            c23260099m.resumeWith(strLIZIZ2);
        } else {
            String aid = aweme.getAid();
            final ?? r5 = new C0T9U(str3, list) { // from class: X.12DS
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1383500m6e
                public final void LJ(String str4, String str5) {
                    super.LJ(str4, str5);
                    if (new C0VSJ(str5).length() == 0) {
                        InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                        C098200Yq c098200Yq = new C098200Yq(new RuntimeException("video file is null"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn2.resumeWith(c098200Yq);
                        return;
                    }
                    C201962140q c201962140q2 = C201962140q.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("video download success");
                    sbLIZ4.append(str5);
                    C201955140j.LJIILL(c201962140q2, "VideoDownloader", C2188811AlT.LIZIZ(sbLIZ4));
                    c259800zU.element = str5;
                    InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                    C189200o6.m2constructorimpl(str5);
                    interfaceC1364105Vn3.resumeWith(str5);
                }

                @Override // X.AbstractC1383500m6e
                public final void LIZIZ(Exception exc, Integer num, String str4) {
                    super.LIZIZ(exc, num, str4);
                    InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq(new RuntimeException(str4));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                }

                @Override // X.AbstractC1383500m6e
                public final void LIZJ(int i, long j, long j2) {
                }
            };
            if (str != null && u.LJIIZILJ(str, "/", false)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str);
                sbLIZ5.append(File.separator);
                sbLIZ5.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
            if (!LocalVideoPlayerManager.LJ().LJIIJ(aid, strLIZIZ, new C14E5() { // from class: X.0m6l
                @Override // X.C14E5
                public final void onFailed() {
                    C1383560m6k.LIZ(list, str, str2, r5);
                }

                @Override // X.C14E5
                public final void onSuccess(String str4) {
                    C0VSJ c0vsj = new C0VSJ(str4);
                    ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_success");
                    AbstractC1383500m6e abstractC1383500m6e = r5;
                    if (abstractC1383500m6e != null) {
                        abstractC1383500m6e.LIZLLL();
                    }
                    AbstractC1383500m6e abstractC1383500m6e2 = r5;
                    if (abstractC1383500m6e2 != null) {
                        abstractC1383500m6e2.LIZJ(100, c0vsj.length(), c0vsj.length());
                    }
                    AbstractC1383500m6e abstractC1383500m6e3 = r5;
                    if (abstractC1383500m6e3 != null) {
                        abstractC1383500m6e3.LJ("local", strLIZIZ);
                    }
                }
            })) {
                C2426709f7.LIZ("duet");
                C1383560m6k.LIZ(list, str, str2, r5);
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
