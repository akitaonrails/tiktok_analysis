package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578180rAe extends Message<C1578180rAe, C1578230rAj> {
    public static final ProtoAdapter<C1578180rAe> ADAPTER = new ProtoAdapter<C1578180rAe>() { // from class: X.0rAa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578180rAe decode(ProtoReader protoReader) {
            C1578230rAj c1578230rAj = new C1578230rAj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1578230rAj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1578230rAj.LJII.add(C1578290rAp.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c1578230rAj.LJI.add(C1578260rAm.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1578230rAj.LJFF.add(C1578210rAh.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1578230rAj.LJ.add(C1578210rAh.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1578230rAj.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578230rAj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578180rAe c1578180rAe) {
            C1578180rAe c1578180rAe2 = c1578180rAe;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1578180rAe2.card_style);
            ProtoAdapter<C1578210rAh> protoAdapter = C1578210rAh.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c1578180rAe2.history_list) + protoAdapter.asRepeated().encodedSizeWithTag(3, c1578180rAe2.trending_list) + C1578260rAm.ADAPTER.asRepeated().encodedSizeWithTag(4, c1578180rAe2.scene_list) + C1578290rAp.ADAPTER.asRepeated().encodedSizeWithTag(5, c1578180rAe2.nav_list) + c1578180rAe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578180rAe c1578180rAe) {
            C1578180rAe c1578180rAe2 = c1578180rAe;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1578180rAe2.card_style);
            ProtoAdapter<C1578210rAh> protoAdapter = C1578210rAh.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c1578180rAe2.history_list);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c1578180rAe2.trending_list);
            C1578260rAm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1578180rAe2.scene_list);
            C1578290rAp.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c1578180rAe2.nav_list);
            protoWriter.writeBytes(c1578180rAe2.unknownFields());
        }
    };
    public Integer card_style;
    public List<C1578210rAh> history_list;
    public List<C1578290rAp> nav_list;
    public List<C1578260rAm> scene_list;
    public List<C1578210rAh> trending_list;

    @Override // com.squareup.wire.Message
    public C1578230rAj newBuilder() {
        return null;
    }

    public C1578180rAe(Integer num, List<C1578210rAh> list, List<C1578210rAh> list2, List<C1578260rAm> list3, List<C1578290rAp> list4) {
        this(num, list, list2, list3, list4, ByteString.EMPTY);
    }

    public C1578180rAe(Integer num, List<C1578210rAh> list, List<C1578210rAh> list2, List<C1578260rAm> list3, List<C1578290rAp> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_style = num;
        this.history_list = C1516540pZE.LJFF("history_list", list);
        this.trending_list = C1516540pZE.LJFF("trending_list", list2);
        this.scene_list = C1516540pZE.LJFF("scene_list", list3);
        this.nav_list = C1516540pZE.LJFF("nav_list", list4);
    }
}
