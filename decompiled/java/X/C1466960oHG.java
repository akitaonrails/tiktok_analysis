package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0oHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466960oHG extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466960oHG(C1415220mvo c1415220mvo, int i) {
        super(5);
        this.$t = i;
        this.l0 = c1415220mvo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466960oHG(C1422780n80 c1422780n80, int i) {
        super(5);
        this.$t = i;
        this.l0 = c1422780n80;
    }

    public static final Object invoke$0(C1466960oHG c1466960oHG, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C1419590n2r c1419590n2r = (C1419590n2r) obj;
        int iIntValue = ((Number) obj3).intValue();
        ((C1422780n80) c1466960oHG.l0).LLJJJIL.LJ(c1419590n2r, (View) obj2, iIntValue, ((Number) obj4).floatValue(), (Bitmap) obj5);
        C1422420n7Q c1422420n7QO4 = ((C1422780n80) c1466960oHG.l0).O4();
        if (c1422420n7QO4 != null) {
            c1422420n7QO4.w2(c1419590n2r, iIntValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1466960oHG c1466960oHG, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj4).intValue();
        String str = (String) obj5;
        ((C1415220mvo) c1466960oHG.l0).getEditModel().creativeModel.effectEntrancePosition = "edit_page";
        ((C1415220mvo) c1466960oHG.l0).getEditModel().creativeModel.effectCarouselAction = str;
        ((C1415220mvo) c1466960oHG.l0).getEditModel().creativeModel.effectCarouselIndex = iIntValue;
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel editModel = ((C1415220mvo) c1466960oHG.l0).getEditModel();
        C1413450msx.LJIILIIL(c1413450msx, editModel, (String) obj2, (String) obj3, null, false, false, (String) obj, iIntValue, str, null, false, 3192);
        return Unit.LIZ;
    }
}
