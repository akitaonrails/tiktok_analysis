package X;

import Y.ARunnableS71S0200000_2;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice.SystemNoticeProtocol;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769006wK implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZIZ$1(C1769006wK c1769006wK, C0YMW c0ymw) {
    }

    public static final void LIZIZ$3(C1769006wK c1769006wK, C0YMW c0ymw) {
    }

    public static final void LIZIZ$5(C1769006wK c1769006wK, C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
            case 4:
                LIZIZ$4(this, c0ymw);
                break;
            case 5:
                LIZIZ$5(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
        }
    }

    public static final void LIZIZ$0(C1769006wK c1769006wK, C0YMW c0ymw) {
        if (c0ymw == null || c0ymw.getThrowable() == null) {
            new Throwable("doDelete: failed");
        }
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) c1769006wK.l1);
        c1389890mGx.LJIIIZ(2131835702);
        c1389890mGx.LJIIJJI();
    }

    public static final void LIZIZ$2(C1769006wK c1769006wK, C0YMW c0ymw) {
        Function0<Unit> function0;
        C1674106h1 c1674106h1 = ((C0Z1R) c1769006wK.l0).LLIZLLLIL;
        if (c1674106h1 != null && (function0 = c1674106h1.LIZIZ) != null) {
            function0.invoke();
        }
        C0Z1R c0z1r = (C0Z1R) c1769006wK.l0;
        C909290Zln c909290Zln = (C909290Zln) c1769006wK.l1;
        c0z1r.getClass();
        C0Z1R.LIZLLL(c909290Zln, "delete", null);
    }

    public static final void LIZIZ$4(C1769006wK c1769006wK, C0YMW c0ymw) {
        if (c0ymw == null || c0ymw.getThrowable() == null) {
            new Throwable();
        }
        if (C06W7.LIZIZ((Activity) c1769006wK.l1)) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) c1769006wK.l1);
            c1389890mGx.LJIIIZ(2131835702);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void onSuccess$0(C1769006wK c1769006wK, Object obj) {
        C06ML c06ml = ((C06MI) c1769006wK.l0).LLILZLL;
        if (c06ml != null) {
            c06ml.LIZJ();
        }
    }

    public static final void onSuccess$1(C1769006wK c1769006wK, Object obj) {
        C2485509ob.LIZIZ(new ARunnableS71S0200000_2((Function0) c1769006wK.l0, (C0Z1R) c1769006wK.l1, 6));
    }

    public static final void onSuccess$2(C1769006wK c1769006wK, Object obj) {
        Function0<Unit> function0;
        C1674106h1 c1674106h1 = ((C0Z1R) c1769006wK.l0).LLIZLLLIL;
        if (c1674106h1 != null && (function0 = c1674106h1.LIZIZ) != null) {
            function0.invoke();
        }
        C0Z1R c0z1r = (C0Z1R) c1769006wK.l0;
        C909290Zln c909290Zln = (C909290Zln) c1769006wK.l1;
        c0z1r.getClass();
        C0Z1R.LIZLLL(c909290Zln, "delete", null);
    }

    public static final void onSuccess$3(C1769006wK c1769006wK, Object obj) {
        AssemVMLazy assemVMLazy = ((SystemNoticeProtocol) c1769006wK.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SystemNoticeProtocol.LLILZLL;
        ((ChatRoomStreakViewModel) assemVMLazy.getValue()).LLJ.remove(((C869590Y9l) c1769006wK.l1).getUuid());
    }

    public static final void onSuccess$4(C1769006wK c1769006wK, Object obj) {
        ((Function0) c1769006wK.l0).invoke();
    }

    public static final void onSuccess$5(C1769006wK c1769006wK, Object obj) {
        ((ChatRoomStreakViewModel) c1769006wK.l0).LLIZLLLIL.remove(((C869590Y9l) c1769006wK.l1).getUuid());
        ((ChatRoomStreakViewModel) c1769006wK.l0).LLJ.remove(((C869590Y9l) c1769006wK.l1).getUuid());
    }

    public C1769006wK(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
