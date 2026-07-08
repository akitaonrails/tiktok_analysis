package X;

import com.ss.android.ugc.aweme.setting.page.shortcut.ShortcutManagerSettingPage;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15tA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20661815tA extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ ShortcutManagerSettingPage LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20661815tA(ShortcutManagerSettingPage shortcutManagerSettingPage, String str) {
        super(2);
        this.LL = shortcutManagerSettingPage;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) {
        if (bool.booleanValue()) {
            ShortcutManagerSettingPage shortcutManagerSettingPage = this.LL;
            String str = this.LLILLJJLI;
            shortcutManagerSettingPage.getClass();
            switch (str.hashCode()) {
                case -1268958287:
                    if (str.equals("follow")) {
                        C1389890mGx c1389890mGx = new C1389890mGx(shortcutManagerSettingPage);
                        c1389890mGx.LJIIIZ(2131835538);
                        c1389890mGx.LJIIJJI();
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(shortcutManagerSettingPage);
                        c1389890mGx2.LJIIIZ(2131835540);
                        c1389890mGx2.LJIIJJI();
                    }
                    break;
                case -600094315:
                    if (str.equals("friends")) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(shortcutManagerSettingPage);
                        c1389890mGx3.LJIIIZ(2131835539);
                        c1389890mGx3.LJIIJJI();
                    }
                    break;
                case 3529462:
                    if (str.equals("shop")) {
                        C1389890mGx c1389890mGx4 = new C1389890mGx(shortcutManagerSettingPage);
                        c1389890mGx4.LJIIIZ(2131835537);
                        c1389890mGx4.LJIIJJI();
                    }
                    break;
                case 100344454:
                    if (str.equals("inbox")) {
                        C1389890mGx c1389890mGx5 = new C1389890mGx(shortcutManagerSettingPage);
                        c1389890mGx5.LJIIIZ(2131835536);
                        c1389890mGx5.LJIIJJI();
                    }
                    break;
            }
            C20662315tF c20662315tF = (C20662315tF) ((LinkedHashMap) this.LL.LLJIJIL).get(this.LLILLJJLI);
            if (c20662315tF != null && c20662315tF.LIZIZ().LLJZ) {
                this.LL.bS(c20662315tF, false);
            }
        }
        return Unit.LIZ;
    }
}
