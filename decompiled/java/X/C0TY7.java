package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordApi;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0TY7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TY7 {
    public final C0TY8 LIZ;
    public final DataChannel LIZIZ;
    public List<BlockWordRecommend> LIZLLL;
    public boolean LJ;
    public long LJI;
    public final BlockWordApi LIZJ = (BlockWordApi) C482260Ivg.LIZJ(BlockWordApi.class);
    public String LJFF = "";

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        Gson gson = C19748512Ol.LIZIZ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<BlockWordRecommend> list = this.LIZLLL;
        if (list != null) {
            for (BlockWordRecommend blockWordRecommend : list) {
                if (blockWordRecommend.selected) {
                    arrayList.add(blockWordRecommend.content);
                }
                arrayList2.add(blockWordRecommend.content);
            }
        }
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("quick_add_add_keyword");
        c474500IjALIZ.LJIJJLI(this.LIZIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList.size()), "num_words");
        c474500IjALIZ.LJJII(arrayList2.toString(), "suggested_words");
        c474500IjALIZ.LJJII(arrayList.toString(), "selected_words");
        boolean z = this.LJ;
        c0tz7.getClass();
        C0TZ7.LIZ(c474500IjALIZ, z);
        c474500IjALIZ.LIZ();
        this.LIZJ.addBlockWord(this.LJFF, this.LJI, GsonProtectorUtils.toJson(gson, arrayList), C0TZ7.LIZIZ(this.LIZIZ) ? 1 : 0).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(this, 49), new AfS181S0100000_12(this, 50));
    }

    public final int LIZJ() {
        List<BlockWordRecommend> list = this.LIZLLL;
        int i = 0;
        if (list != null) {
            Iterator<BlockWordRecommend> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().selected) {
                    i++;
                }
            }
        }
        return i;
    }

    public final void LIZIZ(int i) {
        String str;
        List<BlockWordRecommend> list = this.LIZLLL;
        if (list != null) {
            ((BlockWordRecommend) ListProtector.get(list, i)).selected = !((BlockWordRecommend) ListProtector.get(list, i)).selected;
            this.LIZLLL = list;
            this.LIZ.gN(list);
            BlockWordRecommend blockWordRecommend = (BlockWordRecommend) ListProtector.get(list, i);
            if (blockWordRecommend != null) {
                C0TZ7 c0tz7 = C0TZ7.LIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("quick_add_select_keyword");
                c474500IjALIZ.LJIJJLI(this.LIZIZ);
                c474500IjALIZ.LJJII(blockWordRecommend.content, "word");
                if (blockWordRecommend.selected) {
                    str = "select";
                } else {
                    str = "deselect";
                }
                c474500IjALIZ.LJJII(str, "action");
                boolean z = this.LJ;
                c0tz7.getClass();
                C0TZ7.LIZ(c474500IjALIZ, z);
                c474500IjALIZ.LIZ();
            }
        }
    }

    public final void LIZLLL(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new BlockWordRecommend(true, it2.next()));
        }
        this.LIZLLL = arrayList;
        this.LIZ.gN(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BlockWordRecommend> list2 = this.LIZLLL;
        if (list2 != null) {
            Iterator<BlockWordRecommend> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().content);
            }
        }
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("quick_add_suggest_keyword");
        c474500IjALIZ.LJIJJLI(this.LIZIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList2.size()), "num_words");
        c474500IjALIZ.LJJII(arrayList2.toString(), "suggested_words");
        boolean z = this.LJ;
        c0tz7.getClass();
        C0TZ7.LIZ(c474500IjALIZ, z);
        c474500IjALIZ.LIZ();
    }

    public C0TY7(C0TY8 c0ty8, DataChannel dataChannel) {
        this.LIZ = c0ty8;
        this.LIZIZ = dataChannel;
    }
}
