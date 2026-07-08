package X;

import com.ss.android.ugc.aweme.preview.WebPreviewActivity;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774812Yo implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$1(C19774812Yo c19774812Yo) {
    }

    public static final /* synthetic */ void LIZIZ$2(C19774812Yo c19774812Yo) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
        }
    }

    public static final void LIZ$0(C19774812Yo c19774812Yo) {
        ((WebPreviewActivity) c19774812Yo.l0).LLZZ();
    }

    public static final void LIZ$1(C19774812Yo c19774812Yo) {
        ((C19404910vv) c19774812Yo.l0).LIZ();
    }

    public static final void LIZ$2(C19774812Yo c19774812Yo) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) c19774812Yo.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.iS();
    }

    public static final void LIZ$3(C19774812Yo c19774812Yo) {
        ((Function1) c19774812Yo.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZ$4(C19774812Yo c19774812Yo) {
        ((Function1) c19774812Yo.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZIZ$0(C19774812Yo c19774812Yo) {
        ((WebPreviewActivity) c19774812Yo.l0).finish();
    }

    public static final void LIZIZ$3(C19774812Yo c19774812Yo) {
        ((Function1) c19774812Yo.l0).invoke(Boolean.TRUE);
    }

    public static final void LIZIZ$4(C19774812Yo c19774812Yo) {
        ((Function1) c19774812Yo.l0).invoke(Boolean.TRUE);
    }

    public C19774812Yo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
