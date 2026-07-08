package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454160HrS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C454220HrY LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C454150HrR LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Map<String, String> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454160HrS(C454220HrY c454220HrY, String str, Long l, String str2, int i, String str3, C454150HrR c454150HrR, View view, Function0<Unit> function0, Map<String, String> map) {
        super(0);
        this.LL = c454220HrY;
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
        this.LLIZ = c454150HrR;
        this.LLIZLLLIL = view;
        this.LLJ = function0;
        this.LLJI = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLILZ.setLoading(true);
        C454220HrY c454220HrY = this.LL;
        String str = this.LLILLJJLI;
        Long l = this.LLILLL;
        String str2 = this.LLILZ;
        int i = this.LLILZIL;
        String str3 = this.LLILZLL;
        final C454220HrY c454220HrY2 = this.LL;
        final C454150HrR c454150HrR = this.LLIZ;
        final View view = this.LLIZLLLIL;
        final Function0<Unit> function0 = this.LLJ;
        final Map<String, String> map = this.LLJI;
        final String str4 = this.LLILLJJLI;
        C454140HrQ.LIZIZ(c454220HrY, str, l, str2, i, str3, 2131848904, new InterfaceC450440HlS() { // from class: X.0HrZ
            @Override // X.InterfaceC450440HlS
            public final void LIZ(StickerItem stickerItem) {
                if (stickerItem != null) {
                    C454220HrY c454220HrY3 = c454220HrY2;
                    C454150HrR c454150HrR2 = c454150HrR;
                    View view2 = view;
                    Function0<Unit> function02 = function0;
                    Map<String, String> map2 = map;
                    String str5 = str4;
                    c454150HrR2.getClass();
                    c454220HrY3.LIZJ(C454150HrR.LIZJ(view2, function02));
                    C1350920lG6.LJJIJ(str5, EnumC454270Hrd.SAVE_STICKER.getValue(), EnumC454240Hra.SUCCESS.getValue(), "", EnumC454360Hrm.STICKER_PANEL.getValue(), map2);
                }
            }

            @Override // X.InterfaceC450440HlS
            public final void onFail(int i2) {
                if (i2 == 100018) {
                    C454220HrY c454220HrY3 = c454220HrY2;
                    C454150HrR c454150HrR2 = c454150HrR;
                    View view2 = view;
                    Function0<Unit> function02 = function0;
                    c454150HrR2.getClass();
                    c454220HrY3.LIZJ(C454150HrR.LIZJ(view2, function02));
                } else {
                    c454220HrY2.LLILZ.setLoading(false);
                }
                C1350920lG6.LJJIJ(str4, EnumC454270Hrd.SAVE_STICKER.getValue(), EnumC454240Hra.FAIL.getValue(), String.valueOf(i2), EnumC454360Hrm.STICKER_PANEL.getValue(), map);
            }
        });
        return Unit.LIZ;
    }
}
