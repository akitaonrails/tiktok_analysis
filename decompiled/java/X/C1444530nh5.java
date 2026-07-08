package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS37S0600000_22;

/* JADX INFO: renamed from: X.0nh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444530nh5 extends C09AY implements InterfaceC1631620sYq<C415650GRn, Bitmap, Integer, Unit> {
    public final /* synthetic */ StoryNoteInfoModel LL;
    public final /* synthetic */ C12BX LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILZ;
    public final /* synthetic */ ImageView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444530nh5(StoryNoteInfoModel storyNoteInfoModel, C12BX c12bx, View view, C5183020f c5183020f, ImageView imageView) {
        super(3);
        this.LL = storyNoteInfoModel;
        this.LLILLJJLI = c12bx;
        this.LLILLL = view;
        this.LLILZ = c5183020f;
        this.LLILZIL = imageView;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C415650GRn c415650GRn, Bitmap bitmap, Integer num) {
        List<String> list;
        C415650GRn c415650GRn2 = c415650GRn;
        Bitmap bitmap2 = bitmap;
        AvatarThoughtInfo avatarThoughtInfo = this.LL.avatarInfo;
        if (avatarThoughtInfo != null) {
            list = avatarThoughtInfo.avatarPrimaryUrlList;
        } else {
            list = null;
        }
        AwS37S0600000_22 awS37S0600000_22 = new AwS37S0600000_22(c415650GRn2, (C415650GRn) bitmap2, (Bitmap) this.LLILLJJLI, (C12BX) this.LLILLL, (View) this.LLILZ, (Function1<? super Bitmap, Unit>) this.LLILZIL, (ImageView) 3);
        if (list == null) {
            awS37S0600000_22.invoke(null);
        } else {
            C1331660kl2.LJIIJ(new C03IT(list)).LJJIIJ(new C0ID3(awS37S0600000_22, 6));
        }
        return Unit.LIZ;
    }
}
