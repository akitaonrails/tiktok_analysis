package X;

import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917500zzw extends C09AY implements InterfaceC1631630sYr<UserBanAppealStatusResponse, Map<String, ? extends Object>, Map<String, ? extends String>, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ AnonymousClass1000 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1917500zzw(AnonymousClass1000 anonymousClass1000, String str) {
        super(4);
        this.LL = anonymousClass1000;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(UserBanAppealStatusResponse userBanAppealStatusResponse, Map<String, ? extends Object> map, Map<String, ? extends String> map2, Map<String, ? extends String> map3) {
        UserBanAppealStatusResponse userBanAppealStatusResponse2 = userBanAppealStatusResponse;
        Map<String, ? extends Object> map4 = map;
        Map<String, ? extends String> map5 = map2;
        Map<String, ? extends String> map6 = map3;
        if (userBanAppealStatusResponse2 != null) {
            ((LinkedHashMap) this.LL.LIZLLL).clear();
            this.LL.LIZLLL.put("ban_type", this.LLILLJJLI);
            this.LL.LIZLLL.putAll(map5);
            ((LinkedHashMap) this.LL.LJ).clear();
            this.LL.LJ.put("ban_type", this.LLILLJJLI);
            this.LL.LJ.putAll(map6);
            AnonymousClass1000 anonymousClass1000 = this.LL;
            InterfaceC1917490zzv interfaceC1917490zzv = anonymousClass1000.LIZIZ;
            if (interfaceC1917490zzv != null) {
                interfaceC1917490zzv.LIZ(userBanAppealStatusResponse2, map4, anonymousClass1000.LIZLLL, anonymousClass1000.LJ);
            } else {
                C100C.LIZ.LIZJ().LIZ("pns_ban_show_error", C2097608Jq.LJIIIIZZ(new Pair("ban_type", this.LLILLJJLI), new Pair("error_reason", "empty_popup_handler")));
            }
        } else {
            C100C.LIZ.LIZJ().LIZ("pns_ban_show_error", C2097608Jq.LJIIIIZZ(new Pair("ban_type", this.LLILLJJLI), new Pair("error_reason", "empty_user_ban_config")));
        }
        return Unit.LIZ;
    }
}
