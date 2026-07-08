package X;

import com.ss.android.ugc.aweme.component.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0unt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717830unt extends C09AY implements InterfaceC1685420txc<String, String, String, C19EG, String, Unit> {
    public final /* synthetic */ PhoneNumberAssem LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717830unt(PhoneNumberAssem phoneNumberAssem, C19EG c19eg) {
        super(5);
        this.LL = phoneNumberAssem;
        this.LLILLJJLI = c19eg;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(String str, String str2, String str3, C19EG c19eg, String str4) {
        String str5;
        String str6 = str;
        C19EG c19eg2 = c19eg;
        String str7 = str4;
        int iHashCode = str6.hashCode();
        if (iHashCode != -1881380961) {
            if (iHashCode != 2448401) {
                if (iHashCode == 1980572282) {
                    str5 = "CANCEL";
                }
            } else if (str6.equals("PASS")) {
                C1717860unw c1717860unw = PhoneNumberFragment.LLJJI;
                String str8 = this.LL.Oo().LLILLL;
                C19EG c19eg3 = this.LLILLJJLI;
                c1717860unw.getClass();
                InterfaceC1717870unx interfaceC1717870unx = PhoneNumberFragment.LLJJIJI.get(str8);
                if (interfaceC1717870unx != null) {
                    interfaceC1717870unx.LIZ(true, null, c19eg3, c19eg2, str7);
                }
            }
            return Unit.LIZ;
        }
        str5 = "REJECT";
        str6.equals(str5);
        return Unit.LIZ;
    }
}
