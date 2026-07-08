package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360080E9u implements InterfaceC359970E9j, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C19A3 LL;
    public final C19EG LLILLJJLI;
    public final C1DRG LLILLL;
    public final C0E48 LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664750tQH LLJI;
    public final List<EnumC359990E9l> LLJIJIL = C1697810uHb.LJIIJJI(EnumC359990E9l.OPEN_EDITOR_PRO_CAPTION, EnumC359990E9l.OPEN_EDITOR_PRO_RETOUCH_PANEL);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C360080E9u.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C360080E9u.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C360080E9u.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C360080E9u.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C360080E9u.class, "epEnterApi", "getEpEnterApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/loading/EPEnterLoadingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C360080E9u.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return false;
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJILJIL[5]);
    }

    public final C0EOK LIZLLL() {
        return (C0EOK) this.LLIZ.getValue(this, LLJILJIL[2]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(final LifecycleOwner lifecycleOwner) {
        final EnumC359990E9l initIntent;
        LiveData<Boolean> liveDataXi1;
        C0E48 c0e48;
        C1DRG c1drg;
        final C0EHI value = ((C0EY2) this.LLILZIL.getValue(this, LLJILJIL[0])).zu2().getValue();
        if (value == null) {
            return;
        }
        C0ELJ c0elj = value.LJ;
        if (value.LJFF || (initIntent = c0elj.getInitIntent()) == null) {
            return;
        }
        List<EnumC359990E9l> list = this.LLJIJIL;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<EnumC359990E9l> it2 = list.iterator();
        while (it2.hasNext()) {
            if (initIntent == it2.next()) {
                if (initIntent == EnumC359990E9l.OPEN_EDITOR_PRO_RETOUCH_PANEL && (c0e48 = this.LLILZ) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this.LL)).LLJJI) != null) {
                    C375820EoO.LIZ(this.LL, c0e48, C0ESV.class, new C360040E9q(false, this.LL, c0e48, c1drg), 16);
                    C0EAE c0eae = C0EAE.LIZ;
                    C0EAE.LJIILIIL(LIZJ(), this.LLILZ, C0E98.EDIT_PAGE);
                }
                C0EC7 c0ec7 = (C0EC7) this.LLIZLLLIL.getValue(this, LLJILJIL[3]);
                if (c0ec7 != null && (liveDataXi1 = c0ec7.xi1()) != null) {
                    liveDataXi1.observe(lifecycleOwner, new Observer() { // from class: X.0E9s
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            MutableLiveData<Boolean> mutableLiveDataEa1;
                            MutableLiveData<Boolean> mutableLiveDataEa12;
                            if (C360000E9m.LIZ[initIntent.ordinal()] == 1) {
                                final C360080E9u c360080E9u = this;
                                final C0EHI c0ehi = value;
                                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                                C0EOK c0eokLIZLLL = c360080E9u.LIZLLL();
                                if (c0eokLIZLLL != null && (mutableLiveDataEa12 = c0eokLIZLLL.Ea1()) != null && Intrinsics.LJFF(mutableLiveDataEa12.getValue(), Boolean.TRUE)) {
                                    C354270Duj.LIZ(0L, new AwS406S0200000_5(c360080E9u, c0ehi, 133));
                                    return;
                                }
                                C0EOK c0eokLIZLLL2 = c360080E9u.LIZLLL();
                                if (c0eokLIZLLL2 == null || (mutableLiveDataEa1 = c0eokLIZLLL2.Ea1()) == null) {
                                    return;
                                }
                                mutableLiveDataEa1.observe(lifecycleOwner2, new Observer<Boolean>(c0ehi) { // from class: X.0E9t
                                    public boolean LL;
                                    public final /* synthetic */ C0EHI LLILLL;

                                    @Override // androidx.lifecycle.Observer
                                    public final void onChanged(Boolean bool) {
                                        MutableLiveData<Boolean> mutableLiveDataEa13;
                                        if (this.LL) {
                                            this.LL = false;
                                            return;
                                        }
                                        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                                            C354270Duj.LIZ(0L, new AwS406S0200000_5(this.LLILLJJLI, this.LLILLL, 134));
                                        }
                                        C0EOK c0eokLIZLLL3 = this.LLILLJJLI.LIZLLL();
                                        if (c0eokLIZLLL3 == null || (mutableLiveDataEa13 = c0eokLIZLLL3.Ea1()) == null) {
                                            return;
                                        }
                                        mutableLiveDataEa13.removeObserver(this);
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
                                    {
                                        /*
                                            r2 = this;
                                            r2.LLILLJJLI = r3
                                            r2.LLILLL = r4
                                            r2.<init>()
                                            X.0EOK r0 = r3.LIZLLL()
                                            if (r0 == 0) goto L1d
                                            androidx.lifecycle.MutableLiveData r0 = r0.Ea1()
                                            if (r0 == 0) goto L1d
                                            boolean r1 = r0.isInitialized()
                                            r0 = 1
                                            if (r1 != r0) goto L1d
                                        L1a:
                                            r2.LL = r0
                                            return
                                        L1d:
                                            r0 = 0
                                            goto L1a
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C360070E9t.<init>(X.0E9u, X.0EHI):void");
                                    }
                                });
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[PHI: r13
      0x0083: PHI (r13v3 boolean) = (r13v1 boolean), (r13v4 boolean) binds: [B:34:0x0081, B:40:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.effectmanager.effect.model.Effect r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360080E9u.LJ(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    public C360080E9u(C19A3 c19a3, C19EG c19eg, C1DRG c1drg, C0E48 c0e48) {
        this.LL = c19a3;
        this.LLILLJJLI = c19eg;
        this.LLILLL = c1drg;
        this.LLILZ = c0e48;
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C0EY2.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, C0EC7.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC365030ESv.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }
}
