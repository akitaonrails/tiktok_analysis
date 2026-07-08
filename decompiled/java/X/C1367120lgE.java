package X;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1367120lgE extends C1696260uF6 implements InterfaceC1685420txc<Bitmap, SpannableStringBuilder, C419890GdH, Integer, Integer, Unit> {
    public C1367120lgE(Object obj) {
        super(5, obj, FriendsV3CommentCellAssem.class, "processLoadedAvatarBitmap", "processLoadedAvatarBitmap(Landroid/graphics/Bitmap;Landroid/text/SpannableStringBuilder;Lcom/bytedance/tux/text/span/TuxImageSpan;IILkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Bitmap bitmap, SpannableStringBuilder spannableStringBuilder, C419890GdH c419890GdH, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        FriendsV3CommentCellAssem.Fp((FriendsV3CommentCellAssem) this.receiver, bitmap, spannableStringBuilder, c419890GdH, iIntValue, iIntValue2);
        return Unit.LIZ;
    }
}
