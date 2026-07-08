package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.197r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214885197r implements InterfaceC1623070sL3 {
    public final /* synthetic */ ShortVideoContext LIZ;

    public C214885197r(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.InterfaceC1623070sL3
    public final InterfaceC1628620sU0 LIZ(View view, View view2, FrameLayout frameLayout) {
        ShortVideoContext shortVideoContext = this.LIZ;
        C214882197o c214882197o = new C214882197o(AFwS223S0000000_32.get$arr$(106));
        ((ArrayList) c214882197o.LIZIZ).add(new AwS681S0100000_32(shortVideoContext, 8));
        c214882197o.LIZJ = new C197D(shortVideoContext);
        return new DefaultStickerGuidePresenter(c214882197o, new InterfaceC214889197v() { // from class: X.197z
            @Override // X.InterfaceC214889197v
            public final InterfaceC194555119t LIZ(Effect effect) {
                return LIZIZ(effect, null, null);
            }

            @Override // X.InterfaceC214889197v
            public final InterfaceC194555119t LIZIZ(Effect effect, C1628630sU1 c1628630sU1, C1628640sU2 c1628640sU2) {
                if (C1624570sNT.LJJ(effect)) {
                    return new AnonymousClass1985(effect, new AwS611S0100000_32(c1628630sU1, 175));
                }
                return new AnonymousClass1980(c1628640sU2);
            }
        }, frameLayout);
    }
}
