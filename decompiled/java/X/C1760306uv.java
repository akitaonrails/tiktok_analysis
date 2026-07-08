package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1760306uv extends C09AY implements InterfaceC1631630sYr<String, String, C163T, Integer, Unit> {
    public C1760306uv() {
        super(4);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, C163T c163t, Integer num) {
        int i;
        InterfaceC1760506ux interfaceC1760506ux;
        String reason;
        String str3;
        C163T c163t2 = c163t;
        int iIntValue = num.intValue();
        InterfaceC1760506ux.LJIJJLI.getClass();
        if (c163t2 == null) {
            i = -1;
        } else {
            i = C207125163f.LIZ[c163t2.ordinal()];
        }
        if (i != -1 && i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        interfaceC1760506ux = EnumC1760406uw.TRANSLATION_FAILED;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    interfaceC1760506ux = EnumC1760406uw.SOURCE_LANGUAGE_NOT_SUPPORTED;
                }
            } else {
                interfaceC1760506ux = EnumC1760406uw.SOURCE_LANGUAGE_NOT_DETECTED;
            }
        } else {
            interfaceC1760506ux = new InterfaceC1760506ux() { // from class: X.06v0
            };
        }
        C1759806uq c1759806uq = C1759806uq.LIZ;
        boolean z = interfaceC1760506ux instanceof C1760806v0;
        if (!z && (interfaceC1760506ux instanceof EnumC1760406uw)) {
            reason = ((EnumC1760406uw) interfaceC1760506ux).getReason();
        } else {
            reason = null;
        }
        Pair[] pairArr = new Pair[2];
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_success", str3);
        pairArr[1] = new Pair("duration", String.valueOf(iIntValue));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (reason != null) {
            mapLJIIJ.put("fail_reason", reason);
        }
        C1759806uq.LJFF("im_translation_complete", mapLJIIJ);
        return Unit.LIZ;
    }
}
