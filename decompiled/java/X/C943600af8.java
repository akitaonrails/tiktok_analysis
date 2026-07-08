package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0af8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943600af8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943600af8(int i, String str, int i2, int i3) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<LinkUser> listLJI;
        List<LinkUser> listLIZLLL;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[time = ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis())));
        sbLIZ.append(", state = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", function_call = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", old_state = ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(",  linked_host = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", session_linked_user = ");
        sbLIZ.append((interfaceC954180awCLJIIIZ == null || (listLIZLLL = interfaceC954180awCLJIIIZ.LIZLLL()) == null) ? null : Integer.valueOf(listLIZLLL.size()));
        sbLIZ.append(", session_linked_host = ");
        sbLIZ.append((interfaceC954180awCLJIIIZ == null || (listLJI = C948780anU.LJI(interfaceC954180awCLJIIIZ)) == null) ? null : Integer.valueOf(listLJI.size()));
        sbLIZ.append(", session_linked_guest = ");
        sbLIZ.append(interfaceC954180awCLJIIIZ != null ? Integer.valueOf(((ArrayList) C948780anU.LJFF(interfaceC954180awCLJIIIZ)).size()) : null);
        sbLIZ.append(", ]");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0238006a c0238006a = this.LL == 0 ? new C0238006a("latest disable MG", strLIZIZ, -65536) : new C0238006a("latest enable MG", strLIZIZ, null);
        ((Map) C943610af9.LIZ.getValue()).put(c0238006a.LIZ, c0238006a);
        return Unit.LIZ;
    }
}
