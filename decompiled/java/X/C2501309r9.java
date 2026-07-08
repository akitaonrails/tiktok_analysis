package X;

import com.ss.android.ugc.aweme.photo.PhotoContext;
import java.util.List;

/* JADX INFO: renamed from: X.09r9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501309r9 implements InterfaceC2385309Wh {
    public final int $t;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            default:
                return null;
        }
    }

    public C2501309r9(int i) {
        this.$t = i;
    }

    public C2501309r9(String str, int i) {
        this.$t = i;
    }

    public static final Object then$0(C2501309r9 c2501309r9, C15O7 c15o7) {
        C1C7U.LIZ("BoltsUtils@fdc5.callInUi$2L");
        if (c15o7 != null && !c15o7.LJIILL()) {
            c15o7.LJIILIIL();
        }
        C1C7U.LIZIZ("BoltsUtils@fdc5.callInUi$2L");
        return null;
    }

    public static final Object then$1(C2501309r9 c2501309r9, C15O7 c15o7) {
        C1C7U.LIZ("BoltsUtils@fdc5.callInBackground$2L");
        if (c15o7 != null && !c15o7.LJIILL()) {
            c15o7.LJIILIIL();
        }
        C1C7U.LIZIZ("BoltsUtils@fdc5.callInBackground$2L");
        return null;
    }

    public static final Object then$2(C2501309r9 c2501309r9, C15O7 c15o7) {
        C1C7U.LIZ("TokenSdkTask@3c17.doRealTask$1L");
        if (C848040XOo.LIZIZ != null) {
            C0XGN.LJ();
        }
        C1C7U.LIZIZ("TokenSdkTask@3c17.doRealTask$1L");
        return null;
    }

    public static final Object then$3(C2501309r9 c2501309r9, C15O7 c15o7) {
        C1C7U.LIZ("MvThemeUtils@1e6a.saveMvThemePhoto$2L");
        for (PhotoContext photoContext : (List) c15o7.LJIIL()) {
            InterfaceC2474709mr interfaceC2474709mr = new InterfaceC2474709mr() { // from class: X.09ms
            };
            if (photoContext != null) {
                C1324750kZt.LJIJ(C2474609mq.LIZ(photoContext.getPhotoUri()), photoContext.mWidth, photoContext.mHeight, new C2500709r3(interfaceC2474709mr, 2));
            }
        }
        C1C7U.LIZIZ("MvThemeUtils@1e6a.saveMvThemePhoto$2L");
        return null;
    }
}
