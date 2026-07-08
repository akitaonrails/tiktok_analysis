package X;

import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0sp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1641690sp5 extends C2217421BqW implements Function1<ComposerNode, Unit> {
    public C1641690sp5(C1641680sp4 c1641680sp4) {
        super(1, c1641680sp4, C1641680sp4.class, "doOnClick", "doOnClick(Lcom/ss/android/ugc/effectmanager/effect/model/ComposerNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ComposerNode composerNode) {
        ComposerNode composerNode2 = composerNode;
        C1641680sp4 c1641680sp4 = (C1641680sp4) this.receiver;
        if (c1641680sp4.LLIZLLLIL.contains(composerNode2)) {
            c1641680sp4.LLIZLLLIL.remove(composerNode2);
            InterfaceC1661400tKs interfaceC1661400tKs = c1641680sp4.LLILZIL;
            C1641710sp7 c1641710sp7 = c1641680sp4.LLIZLLLIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1641710sp7, 10));
            for (ComposerNode composerNode3 : c1641710sp7) {
                String unzipPath = composerNode3.effect.getUnzipPath();
                String extra = composerNode3.effect.getExtra();
                if (extra == null) {
                    extra = "";
                }
                arrayList.add(new ComposerInfo(unzipPath, extra, (String) null, 12));
            }
            interfaceC1661400tKs.L4(arrayList, 20000);
        } else if (u.LJIJI(composerNode2.UI_name, "clear", true)) {
            c1641680sp4.LJJIIJ();
            c1641680sp4.LLILZIL.LJJLIIIJJI();
        } else {
            c1641680sp4.LLILZ.LIZJ(composerNode2.effect, new C1698190uID(c1641680sp4, composerNode2, 3));
        }
        return Unit.LIZ;
    }
}
