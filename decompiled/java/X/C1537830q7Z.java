package X;

import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.TemplateBundle;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537830q7Z extends C1537910q7h {
    public Map<String, C1311220kE4> LJJJJ;
    public List<C1311670kEn> LJJJJI;
    public C1067460dsu LJJJJIZL;
    public C649560Pdq LJJJJJ;
    public String LJJJJJL;
    public Uri LJJJJL;
    public TemplateBundle LJJJJLI;
    public Function0<? extends AnonymousClass0957<TemplateBundle>> LJJJJLL;
    public byte[] LJJJJZ;
    public ByteBuffer LJJJJZI;
    public final C1537480q70 LJJJLIIL;
    public final EnumC1067640dtC LJJJLL;

    public C1537830q7Z() {
        throw null;
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C1537910q7h
    public final Map<String, Object> LJIJI() {
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        return C1326430kcb.LIZ().LIZIZ(this.LJJJLIIL.containerId);
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final Map<String, Object> LJFF() {
        return LJIJI();
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final Uri LIZ() {
        return this.LJJJJL;
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final HybridSchemaParam LIZJ() {
        return this.LJJIIJ;
    }

    @Override // X.C1537910q7h
    public final C649560Pdq LJIIIZ() {
        return this.LJJJJJ;
    }

    @Override // X.C1537910q7h
    public final C1067460dsu LJIIJ() {
        return this.LJJJJIZL;
    }

    @Override // X.C1537910q7h
    public final List<C1311670kEn> LJIIJJI() {
        return this.LJJJJI;
    }

    @Override // X.C1537910q7h
    public final Map<String, C1311220kE4> LJIIL() {
        return this.LJJJJ;
    }

    @Override // X.C1537910q7h
    public final String LJIILIIL() {
        return this.LJJJJJL;
    }

    @Override // X.C1537910q7h
    public final byte[] LJIILJJIL() {
        return this.LJJJJZ;
    }

    @Override // X.C1537910q7h
    public final ByteBuffer LJIILL() {
        return this.LJJJJZI;
    }

    @Override // X.C1537910q7h
    public final TemplateBundle LJIILLIIL() {
        return this.LJJJJLI;
    }

    @Override // X.C1537910q7h
    public final Function0<AnonymousClass0957<TemplateBundle>> LJIIZILJ() {
        return this.LJJJJLL;
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final EnumC1067640dtC getType() {
        return this.LJJJLL;
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final void LIZLLL(Map<String, ? extends Object> map) {
        if (map != null) {
            C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
            C1326430kcb.LIZ().LJ(this.LJJJLIIL.containerId, map);
        }
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final void LJ(HybridSchemaParam hybridSchemaParam) {
        this.LJJIIJ = hybridSchemaParam;
    }

    @Override // X.C1537910q7h, X.InterfaceC1531560pxS
    public final void LJI(Uri uri) {
        this.LJJJJL = uri;
    }

    @Override // X.C1537910q7h
    public final void LJIJJ(C649560Pdq c649560Pdq) {
        this.LJJJJJ = c649560Pdq;
    }

    @Override // X.C1537910q7h
    public final void LJIJJLI(C1067460dsu c1067460dsu) {
        this.LJJJJIZL = c1067460dsu;
    }

    @Override // X.C1537910q7h
    public final void LJIL(List<C1311670kEn> list) {
        this.LJJJJI = list;
    }

    @Override // X.C1537910q7h
    public final void LJJ(Map<String, C1311220kE4> map) {
        this.LJJJJ = map;
    }

    @Override // X.C1537910q7h
    public final void LJJI(String str) {
        this.LJJJJJL = str;
    }

    @Override // X.C1537910q7h
    public final void LJJIFFI(byte[] bArr) {
        this.LJJJJZ = bArr;
    }

    @Override // X.C1537910q7h
    public final void LJJII(ByteBuffer byteBuffer) {
        this.LJJJJZI = byteBuffer;
    }

    @Override // X.C1537910q7h
    public final void LJJIII(TemplateBundle templateBundle) {
        this.LJJJJLI = templateBundle;
    }

    public C1537830q7Z(Uri uri, C1537480q70 c1537480q70) {
        super(null, null, null, null, "", uri, null, null, null, 512);
        this.LJJJJ = null;
        this.LJJJJI = null;
        this.LJJJJIZL = null;
        this.LJJJJJ = null;
        this.LJJJJJL = "";
        this.LJJJJL = uri;
        this.LJJJJLI = null;
        this.LJJJJLL = null;
        this.LJJJJZ = null;
        this.LJJJJZI = null;
        this.LJJJLIIL = c1537480q70;
        this.LJJJLL = EnumC1067640dtC.LYNX;
    }
}
