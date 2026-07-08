package Y;

import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS1S1302000_29 implements Callable {
    public final int $t;
    public int i4;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    public static final Object call$0(ACallableS1S1302000_29 aCallableS1S1302000_29) {
        return ((MvChooseCoverBitmapCreator) aCallableS1S1302000_29.l1).lambda$getCoverWithoutSeek$1((byte[]) aCallableS1S1302000_29.l2, aCallableS1S1302000_29.i4, aCallableS1S1302000_29.i5, aCallableS1S1302000_29.s0, (InterfaceC1487280oo2) aCallableS1S1302000_29.l3);
    }

    public static final Object call$1(ACallableS1S1302000_29 aCallableS1S1302000_29) {
        return ((MvChooseCoverBitmapCreator) aCallableS1S1302000_29.l1).lambda$getCoverWithSeekWithResult$9(aCallableS1S1302000_29.i4, aCallableS1S1302000_29.i5, (byte[]) aCallableS1S1302000_29.l2, (InterfaceC1487280oo2) aCallableS1S1302000_29.l3, aCallableS1S1302000_29.s0);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public ACallableS1S1302000_29(int i, int i2, MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator, InterfaceC1487280oo2 interfaceC1487280oo2, String str, byte[] bArr, int i3) {
        this.$t = i3;
        if (i3 != 0) {
            this.l1 = mvChooseCoverBitmapCreator;
            this.i4 = i;
            this.i5 = i2;
            this.l2 = bArr;
            this.l3 = interfaceC1487280oo2;
            this.s0 = str;
            return;
        }
        this.l1 = mvChooseCoverBitmapCreator;
        this.l2 = bArr;
        this.i4 = i;
        this.i5 = i2;
        this.s0 = str;
        this.l3 = interfaceC1487280oo2;
    }
}
