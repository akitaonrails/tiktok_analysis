package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KBK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBK extends C0K07<C515540KJs> {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final ViewGroup LLILLL;

    public C0KBK(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.q92);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.q93);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.q90);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        ISubPackagePageAbility iSubPackagePageAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        final C513700KCq c513700KCqKu = null;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            c513700KCqKu = iSubPackagePageAbility.Ku();
            iSubPackagePageAbility.Z8(new C0KBL(this));
        }
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0KBG
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    String str2;
                    String str3;
                    C0KCF c0kcf;
                    C0KCF c0kcf2;
                    C0KCF c0kcf3;
                    String str4;
                    C0KCF c0kcf4;
                    C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_subscribe/privilege_page");
                    c495520Jby.LIZJ("is_sheet", "1");
                    C513700KCq c513700KCq = c513700KCqKu;
                    String str5 = "";
                    if (c513700KCq == null || (c0kcf4 = c513700KCq.LL) == null || (str = c0kcf4.LJIIIIZZ) == null) {
                        str = "";
                    }
                    c495520Jby.LIZJ("group_id", str);
                    C513700KCq c513700KCq2 = c513700KCqKu;
                    if (c513700KCq2 != null && (c0kcf3 = c513700KCq2.LL) != null && (str4 = c0kcf3.LIZ) != null) {
                        str5 = str4;
                    }
                    c495520Jby.LIZJ("sec_anchor_id", str5);
                    C513700KCq c513700KCq3 = c513700KCqKu;
                    if (c513700KCq3 == null || (c0kcf2 = c513700KCq3.LL) == null || (str2 = c0kcf2.LIZIZ) == null) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c495520Jby.LIZJ("anchor_id", str2);
                    C513700KCq c513700KCq4 = c513700KCqKu;
                    if (c513700KCq4 != null && (c0kcf = c513700KCq4.LL) != null) {
                        str3 = c0kcf.LJII;
                    } else {
                        str3 = null;
                    }
                    c495520Jby.LIZJ("show_entrance", str3);
                    c495520Jby.LIZJ("previous_page", "package_page_new");
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C176600m4.LIZ(), UriProtector.parse(c495520Jby.LIZLLL()));
                }
            });
        }
    }
}
