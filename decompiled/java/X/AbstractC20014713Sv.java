package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20014713Sv extends C13T3 {
    public final Charset LJIILIIL;

    @Override // X.C13T3
    public final Charset LJIJI() {
        return this.LJIILIIL;
    }

    @Override // X.C13T3, X.C13UG
    public final void initialize() {
        super.initialize();
    }

    public AbstractC20014713Sv(C13U8 c13u8) {
        super(c13u8);
        this.LJIILIIL = Charsets.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x012c A[Catch: all -> 0x013f, TryCatch #0 {all -> 0x013f, blocks: (B:3:0x0001, B:5:0x0009, B:10:0x0020, B:12:0x0028, B:14:0x0038, B:15:0x003f, B:17:0x0049, B:22:0x0069, B:38:0x0133, B:20:0x005a, B:37:0x012c, B:23:0x0098, B:25:0x00a0, B:27:0x00b0, B:28:0x00b7, B:30:0x00c1, B:32:0x00d4, B:33:0x00d8, B:36:0x0125, B:35:0x0117, B:39:0x0139), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // X.C13T3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20014713Sv.LJJIII(java.util.List):void");
    }

    @Override // X.C13T3
    public final void LJJIIJ(List<String> list) {
        ArrayList arrayList = (ArrayList) list;
        arrayList.add("libcore.io.DiskLruCache");
        arrayList.add("1");
        arrayList.add(CardStruct.IStatusCode.DEFAULT);
        arrayList.add("1");
        arrayList.add("");
    }

    @Override // X.C13T3
    public final String LJJ(EnumC1876880ywQ enumC1876880ywQ, C20014813Sw c20014813Sw) {
        return super.LJJ(enumC1876880ywQ, c20014813Sw);
    }
}
