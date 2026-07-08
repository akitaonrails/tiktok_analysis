package X;

import Y.AgS299S0100000_18;
import com.ss.android.ugc.tools.chat.common.save.AiChatFileServiceImpl;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0zpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.save.AiChatFileServiceImpl$downloadToCache$1", f = "AiChatFileServiceImpl.kt", l = {69}, m = "invokeSuspend")
public final class C1910960zpO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AiChatFileServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC1157570gEF<String>> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910960zpO(AiChatFileServiceImpl aiChatFileServiceImpl, String str, InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0u, int i, String str2, InterfaceC1364105Vn<? super C1910960zpO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aiChatFileServiceImpl;
        this.LLILLL = str;
        this.LLILZ = interfaceC332260D0u;
        this.LLILZIL = i;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1910960zpO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strSubstring;
        InterfaceC1157570gEF<String> c1155990gBh;
        C1C7U.LIZ("AiChatFileServiceImpl@d993.downloadToCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AiChatFileServiceImpl aiChatFileServiceImpl = this.LLILLJJLI;
            String str = this.LLILLL;
            aiChatFileServiceImpl.getClass();
            boolean zLJJIIJZLJL = u.LJJIIJZLJL(str, "file://", false);
            boolean zLJJIIJZLJL2 = u.LJJIIJZLJL(str, File.separator, false);
            if (!zLJJIIJZLJL) {
                if (!zLJJIIJZLJL2) {
                    AiChatFileServiceImpl aiChatFileServiceImpl2 = this.LLILLJJLI;
                    String str2 = this.LLILLL;
                    int i2 = this.LLILZIL;
                    String str3 = this.LLILZLL;
                    aiChatFileServiceImpl2.getClass();
                    b bVarLJ = C09IC.LJ(new C1910980zpQ(str2, str3, i2, aiChatFileServiceImpl2, null));
                    AgS299S0100000_18 agS299S0100000_18 = new AgS299S0100000_18(this.LLILZ, 1);
                    this.LL = 1;
                    if (bVarLJ.collect(agS299S0100000_18, this) == objLJFF) {
                        C1C7U.LIZIZ("AiChatFileServiceImpl@d993.downloadToCache$1");
                        return objLJFF;
                    }
                } else {
                    strSubstring = str;
                }
            } else {
                strSubstring = str.substring(7);
            }
            C0VSJ c0vsj = new C0VSJ(strSubstring);
            if (c0vsj.exists() && c0vsj.isFile()) {
                c1155990gBh = new C1157450gE3<>(str, EnumC1156000gBi.CACHE);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Local file check failed: File does not exist or is a directory at path '");
                sbLIZ.append(strSubstring);
                sbLIZ.append('\'');
                c1155990gBh = new C1155990gBh(new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ)), 2);
            }
            this.LLILZ.setValue(c1155990gBh);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiChatFileServiceImpl@d993.downloadToCache$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatFileServiceImpl@d993.downloadToCache$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
