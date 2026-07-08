package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C026Y extends Message<C026Y, C02PK> {
    public static final ProtoAdapter<C026Y> ADAPTER = new ProtoAdapter<C026Y>() { // from class: X.023F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C026Y decode(ProtoReader protoReader) {
            C026Y c026y = new C026Y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c026y.title = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c026y.logistic_expression_areas.add(C023Z.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c026y.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c026y.additional_areas.add(C5431029t.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c026y.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c026y.background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c026y.clickable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c026y.click_desc = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c026y;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C026Y c026y) {
            C026Y c026y2 = c026y;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c026y2.title) + C023Z.ADAPTER.asRepeated().encodedSizeWithTag(2, c026y2.logistic_expression_areas) + ProtoAdapter.INT32.encodedSizeWithTag(3, c026y2.style) + protoAdapter.asRepeated().encodedSizeWithTag(4, c026y2.additional_areas) + ProtoAdapter.STRING.encodedSizeWithTag(5, c026y2.link) + C618602bA.ADAPTER.encodedSizeWithTag(6, c026y2.background_color) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c026y2.clickable) + protoAdapter.encodedSizeWithTag(8, c026y2.click_desc) + c026y2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C026Y c026y) {
        }
    };
    public List<C5431029t> additional_areas;
    public C618602bA background_color;
    public C5431029t click_desc;
    public Boolean clickable;
    public String link;
    public List<C023Z> logistic_expression_areas;
    public Integer style;
    public C5431029t title;

    public C026Y() {
        super(ADAPTER, ByteString.EMPTY);
        this.logistic_expression_areas = C1516540pZE.LJIIIIZZ();
        this.additional_areas = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
