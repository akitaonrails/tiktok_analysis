package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.169w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showVideoRain$1", f = "EasterEggForShareAssem.kt", l = {}, m = "invokeSuspend")
public final class C207298169w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EasterEggForShareAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<C0NPA> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207298169w(EasterEggForShareAssem easterEggForShareAssem, String str, List<C0NPA> list, List<String> list2, InterfaceC1364105Vn<? super C207298169w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = easterEggForShareAssem;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C207298169w c207298169w = new C207298169w(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c207298169w.LL = obj;
        return c207298169w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.File] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionInfo sessionInfoJo;
        List<C0NPA> listSubList;
        String strLJII;
        T t;
        String strLJIILJJIL;
        IMUser singleChatFromUser;
        IMUser singleChatFromUser2;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILLJJLI.Vo("high_frequency_sharing", this.LLILLL);
        C01GW c01gw = C0AL5.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2) {
            this.LLILLJJLI.So(jCurrentTimeMillis, "high_frequency_sharing", this.LLILLL, "not_shown", "downgrade_level2");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
            return unit;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLJJLI);
        if (c19egLIZ != null && C0SXG.LIZ(c19egLIZ)) {
            this.LLILLJJLI.So(jCurrentTimeMillis, "high_frequency_sharing", this.LLILLL, "not_shown", "landscape");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
            return unit2;
        }
        SessionInfo sessionInfoJo2 = this.LLILLJJLI.Jo();
        if ((sessionInfoJo2 != null && (singleChatFromUser2 = sessionInfoJo2.getSingleChatFromUser()) != null && singleChatFromUser2.isBlock()) || ((sessionInfoJo = this.LLILLJJLI.Jo()) != null && (singleChatFromUser = sessionInfoJo.getSingleChatFromUser()) != null && singleChatFromUser.isBlocked())) {
            this.LLILLJJLI.So(jCurrentTimeMillis, "high_frequency_sharing", this.LLILLL, "not_shown", "blocked_user");
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
            return unit3;
        }
        if (10 <= this.LLILZ.size() && this.LLILZ.size() < 20) {
            int size = this.LLILZ.size() - 10;
            if (size < 0) {
                size = 0;
            }
            listSubList = this.LLILZ.subList(size, size + 10);
        } else if (20 <= this.LLILZ.size()) {
            if (((Number) c01gw.getValue()).intValue() == 1) {
                int size2 = this.LLILZ.size() - 10;
                if (size2 < 0) {
                    size2 = 0;
                }
                listSubList = this.LLILZ.subList(size2, size2 + 10);
            } else {
                int size3 = this.LLILZ.size() - 20;
                if (size3 < 0) {
                    size3 = 0;
                }
                listSubList = this.LLILZ.subList(size3, size3 + 20);
            }
        } else {
            listSubList = this.LLILZ;
        }
        this.LLILLJJLI.Lo("share_high_frequency");
        DataSource dataSource = (DataSource) ((Map) this.LLILLJJLI.LLJJ.getValue()).get("share_high_frequency");
        if (dataSource == null) {
            this.LLILLJJLI.So(jCurrentTimeMillis, "high_frequency_sharing", this.LLILLL, "not_shown", "gecko_data_source_null");
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
            return unit4;
        }
        IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpi$default(IDMGeckoCommonChannelManager.class, false, false, false, 14, null);
        if (iDMGeckoCommonChannelManager != null && (strLJII = iDMGeckoCommonChannelManager.LJII()) != null) {
            C259800zU c259800zU = new C259800zU();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJII);
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append("share_high_frequency");
            sbLIZ.append(str);
            sbLIZ.append("display_text");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
            if (fileArrListFiles != 0) {
                EasterEggForShareAssem easterEggForShareAssem = this.LLILLJJLI;
                for (?? r1 : fileArrListFiles) {
                    easterEggForShareAssem.getClass();
                    I18nManagerServiceApi i18nManagerServiceApi = (I18nManagerServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nManagerServiceApi.class, false, false, false, 14, null);
                    if (i18nManagerServiceApi == null || (strLJIILJJIL = i18nManagerServiceApi.LJIILJJIL(easterEggForShareAssem.getContext())) == null) {
                        strLJIILJJIL = "default";
                    }
                    if (u.LJJIIJZLJL(r1.getName(), strLJIILJJIL, false) && u.LJIIZILJ(r1.getName(), ".png", false)) {
                        c259800zU.element = r1;
                    }
                }
            }
            if (c259800zU.element == 0) {
                File[] fileArrListFiles2 = new C0VSJ(strLIZIZ).listFiles();
                if (fileArrListFiles2 != 0) {
                    int length = fileArrListFiles2.length;
                    for (int i = 0; i < length; i++) {
                        t = fileArrListFiles2[i];
                        if (Intrinsics.LJFF(t.getPath(), "default.png")) {
                            break;
                        }
                    }
                    t = 0;
                    c259800zU.element = t;
                } else {
                    t = 0;
                    c259800zU.element = t;
                }
            }
            File file = (File) c259800zU.element;
            if (file != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.outWidth = 1638;
                options.outHeight = 269;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                if (bitmapDecodeFile != null) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C207300169y(this.LLILLJJLI, listSubList, this.LLILLL, jCurrentTimeMillis, dataSource, bitmapDecodeFile, this.LLILZIL, this.LLILZ, null), 2);
                    Unit unit5 = Unit.LIZ;
                    C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
                    return unit5;
                }
            }
            this.LLILLJJLI.So(jCurrentTimeMillis, "high_frequency_sharing", this.LLILLL, "not_shown", "text_bitmap_null");
            Unit unit6 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
            return unit6;
        }
        this.LLILLJJLI.So(jCurrentTimeMillis, "high_frequency_sharing", this.LLILLL, "not_shown", "gecko_dir_null");
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
